package com.springmvc.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.controller.BookController;
import com.springmvc.domain.Book;
import com.springmvc.exception.BookIdException;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	public static Logger logger = LoggerFactory.getLogger(BookRepositoryImpl.class);
	
	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN1234","C# 교과서", 30000);
		book1.setAuthor("박용준");
		book1.setDescription("C# 교과서는 생애 첫 프로그래밍 언어로 C#을 시작하는 독자를 대상으로 한다. 특히 응용 프로그래머를 위한 C# 입문서로, "
				+ "C#을 사용하여 게임(유니티), 웹, 모바일,IoT 등을 개발할 때 필요한 C# 기초 문법을 익히고 기본기를 탄탄하게 다지는 것이 목적이다.");
		book1.setPublisher("길벗");
		book1.setCategory("IT전문서");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2020/05/29");
		
		Book book2 = new Book("ISBN1235","Node.js 교과서", 36000);
		book2.setAuthor("조현영");
		book2.setDescription("이 책은 프론트부터 서버, 데이터베이스, 배포까지 아우르는 광범위한 내용을 다룬다. 군더더기 없는 직관적인 설명으로 기본 개념을 확실히 이해하고, "
				+ "노드의 기능과 생태계를 사용해 보면서 실제로 동작하는 서버를 만들어보자. 예제와 코드는 최신 문법을 사용했고 실무에 참고하거나 당장 적용할 수 있다.");
		book2.setPublisher("길벗");
		book2.setCategory("IT전문서");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2020/07/25");
		
		Book book3 = new Book("ISBN1236","어도비 XD CC 2020", 25000);
		book3.setAuthor("김두한");
		book3.setDescription("어도비 XD 프로그램을 통해 UI/UX 디자인을 배우고자 하는 예비 디자이너의 눈높이에 맞게 기본적인 도구를 활용한 아이콘 디자인과 웹&앱 페이지 디자인, "
				+ "UI 디자인, 앱 디자인에 애니메이션과 인터랙션을 적용한 프로토타이핑을 학습합니다. ");
		book3.setPublisher("길벗");
		book3.setCategory("IT활용서");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2019/05/29");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	
	@Override
	public List<Book> getAllBookList() {
		String SQL = "SELECT * FROM book";
		List<Book> listOfBooks = template.query(SQL, new BookRowMapper());
		return listOfBooks;
	}

	@Override
	public List<Book> getBookListByCategory(String category) {
		logger.info("getBookListByCategory : " + category);
		List<Book> booksByCategory = new ArrayList<Book>();
		String SQL = "SELECT * FROM book where b_category LIKE '%" + category + "%'";
		booksByCategory = template.query(SQL, new BookRowMapper());
		return booksByCategory;
	}

	@Override
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
		logger.info("getBookListByFilter : " + filter);
		Set<Book> booksByPublisher = new HashSet<Book>();
		Set<Book> booksByCategory = new HashSet<Book>();
		Set<String> criterias = filter.keySet();
		
		
		if (criterias.contains("publisher")) {
			for (int j=0; j<filter.get("publisher").size(); j++) {
				String publisherName = filter.get("publisher").get(j);
				String SQL = "SELECT * FROM book where b_publisher LIKE '%" + publisherName + "%'";
				booksByPublisher.addAll(template.query(SQL, new BookRowMapper()));
			}
		}
		
		if (criterias.contains("category")) {
			for (int i=0; i<filter.get("category").size(); i++) {
				String category = filter.get("category").get(i);
				String SQL = "SELECT * FROM book where b_category LIKE '%" + category + "%'";
				booksByCategory.addAll(template.query(SQL, new BookRowMapper()));
			}
		}
		
		booksByCategory.retainAll(booksByPublisher);
		logger.info("👉 booksByCategory값:"+booksByCategory);
		return booksByCategory;
	}
	
	

	@Override
	public Book getBookById(String bookId) {
		logger.info("📥 [getBookById] 도서 ID: {}", bookId);
		Book bookInfo = null;
		String SQL = "SELECT count(*) FROM book where b_bookId=?";
		int rowCount = template.queryForObject(SQL, Integer.class, bookId);
		if (rowCount != 0) {
			SQL = "SELECT * FROM book where b_bookId=?";
			bookInfo = template.queryForObject(SQL, new Object[] {bookId}, new BookRowMapper());
		}
		if (bookInfo == null) {
			throw new BookIdException(bookId);
		}
		return bookInfo;
	}

	@Override
	public void setNewBook(Book book) {
		logger.info("📤 [setNewBook] 신규 도서 등록: {}", book);
		listOfBooks.add(book);
		String SQL = "INSERT INTO book (b_bookId, b_name, b_unitPrice, b_author, b_description, b_publisher, b_category, b_unitsInStock, b_releaseDate, b_condition, b_fileName)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		template.update(SQL, book.getBookId(), book.getName(), book.getUnitPrice(), book.getAuthor(), book.getDescription(), book.getPublisher(), book.getCategory(), book.getUnitsInStock(), book.getReleaseDate(), book.getCondition(), book.getFileName());
	}

	@Override
	public void setUpdateBook(Book book) {
		if (book.getFileName() != null) {
			String SQL = "UPDATE Book SET b_name = ?, b_unitPrice = ?, b_author = ?, b_description = ?, b_publisher = ?, b_category = ?, b_unitsInStock = ?, b_releaseDate = ?, b_condition = ? , b_fileName = ? where b_bookId = ?";
			template.update(SQL, book.getName(), book.getUnitPrice(), book.getAuthor(), book.getDescription(), book.getPublisher(), book.getCategory(), book.getUnitsInStock(), book.getReleaseDate(), book.getCondition(), book.getFileName(), book.getBookId());
		} else if (book.getFileName() == null) {
			String SQL = "UPDATE Book SET b_name = ?, b_unitPrice = ?, b_author = ?, b_description = ?, b_publisher = ?, b_category = ?, b_unitsInStock = ?, b_releaseDate = ?, b_condition = ? where b_bookId = ?";
			template.update(SQL, book.getName(), book.getUnitPrice(), book.getAuthor(), book.getDescription(), book.getPublisher(), book.getCategory(), book.getUnitsInStock(), book.getReleaseDate(), book.getCondition(), book.getBookId());
		}
		
	}

	@Override
	public void setDeleteBook(String bookID) {
		String SQL = "DELETE from Book where b_bookId = ? ";
		this.template.update(SQL, bookID);
	}
}
