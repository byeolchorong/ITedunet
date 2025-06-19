package com.springmvc.controller;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.domain.Book;
import com.springmvc.exception.BookIdException;
import com.springmvc.exception.CategoryException;
import com.springmvc.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public String requestBookList(Model model) {
		System.out.println("📥 [GET] /books 진입");
		List<Book> list = bookService.getAllBookList(); // 모델이동
		System.out.println("📡 서비스 결과 리스트 크기: " + list.size());
		model.addAttribute("bookList", list);
		return "books";
	}
	
	@GetMapping("/all")
	public ModelAndView requestAllBooks() {
		System.out.println("📥 [GET] /books/all 진입");
		ModelAndView ModelAndView = new ModelAndView();
		List<Book> list = bookService.getAllBookList(); // 모델이동
		System.out.println("📡 서비스 결과 리스트 크기: " + list.size());
		ModelAndView.addObject("bookList", list);
		ModelAndView.setViewName("books");
		return ModelAndView;
	}
	
	@GetMapping("/{category}")
	public String requestBooksByCategory(@PathVariable("category") String bookCategory, Model model) {
		System.out.println("📥 [GET] /books/{category} 진입. category = " + bookCategory);
		List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
		
		if (booksByCategory == null || booksByCategory.isEmpty()) {
			System.out.println("⚠️ 카테고리에 해당하는 도서 없음. 예외 발생!");
			throw new CategoryException();
		}
		System.out.println("📚 category 결과 리스트 크기: " + booksByCategory.size());
		model.addAttribute("bookList", booksByCategory);
		System.out.println("👉 booksByCategory값 : " + booksByCategory);
		return "books";
	}
	
	@GetMapping("/filter/{bookFilter}")
	public String requestBooksByFilter(
	@MatrixVariable(pathVar="bookFilter") Map<String, List<String>> bookFilter,
	Model model) {
		 System.out.println("📥 [GET] /books/filter 호출됨!");
	        System.out.println("🔍 전달받은 필터 Map: " + bookFilter);
		Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
		System.out.println("📚 필터 결과 Set 크기: " + booksByFilter.size());
		
		model.addAttribute("bookList", booksByFilter);
		return "books";
	}
	
	@GetMapping("/book")
	public String requestBookById(@RequestParam("id") String bookId, Model model) {
		System.out.println("📥 [GET] bookId : " + bookId);
		Book bookById = bookService.getBookById(bookId);
		 System.out.println("📘 조회된 책: " + bookById);
		model.addAttribute("book", bookById);
		return "book";
	}
	
	@GetMapping("/add") 
	public String requestAddBookForm(@ModelAttribute("NewBook") Book book) {
		System.out.println("📥 [GET] /books/add 진입 - 도서 등록 폼 요청");
		return "addBook";
	}
	@PostMapping("/add")
	public String submitAddNewBook(@ModelAttribute("NewBook") Book book, HttpServletRequest request) {
		System.out.println("📤 [POST] /books/add 진입 - 등록할 도서 정보: " + book.toString());
		MultipartFile bookImage = book.getBookImage();
		
		String saveName = bookImage.getOriginalFilename();
		String path = request.getRealPath("resources/images");
		File saveFile = new File(path, saveName);
		
		if (bookImage != null && !bookImage.isEmpty()) {
			try {
				bookImage.transferTo(saveFile);
				System.out.println("✅ 이미지 업로드 성공");
			} catch(Exception e) {
				System.out.println("❌ 이미지 업로드 실패: " + e.getMessage());
				throw new RuntimeException("도서 이미지 업로드가 실패하였습니다.", e);
			}
		}
		
		bookService.setNewBook(book);
		System.out.println("📚 도서 등록 완료!");
		return "redirect:/books";
	}
	
	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("addTitle", "신규 도서 등록");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("🛠 InitBinder 동작 - 허용 필드 설정");
		binder.setAllowedFields("bookId", "name", "unitPrice", "author", "description", "publisher", "category", "unitsInStock", "totalPages", "releaseDate", "condition", "bookImage");
	}
	
	@ExceptionHandler(value= {BookIdException.class})
	public ModelAndView handleError(HttpServletRequest req, BookIdException exception) {
		System.out.println("🚨 BookIdException 발생 핸들러 진입!");
        System.out.println("🔍 잘못된 Book ID: " + exception.getBookId());
        System.out.println("🌐 요청 URL: " + req.getRequestURL() + "?" + req.getQueryString());
        
		ModelAndView mav = new ModelAndView();
		mav.addObject("invalidBookId", exception.getBookId());
		mav.addObject("exception", exception);
		mav.addObject("url", req.getRequestURL() + "?" + req.getQueryString());
		mav.setViewName("errorBook");
		return mav;
	}
}
