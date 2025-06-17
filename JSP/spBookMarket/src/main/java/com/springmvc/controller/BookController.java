package com.springmvc.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public String requestBookList(Model model) {
		List<Book> list = bookService.getAllBookList(); // 모델이동
		model.addAttribute("bookList", list);
		return "books";
	}
	
	@GetMapping("/all")
	public ModelAndView requestAllBooks() {
		ModelAndView ModelAndView = new ModelAndView();
		List<Book> list = bookService.getAllBookList(); // 모델이동
		ModelAndView.addObject("bookList", list);
		ModelAndView.setViewName("books");
		return ModelAndView;
	}
	
	@GetMapping("/{category}")
	public String requestBooksByCategory(@PathVariable("category") String bookCategory, Model model) {
		System.out.println("📌 category 호출됨!");
		List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
		model.addAttribute("bookList", booksByCategory);
		System.out.println("👉 booksByCategory값 : " + booksByCategory);
		return "books";
	}
	
	@GetMapping("/filter/{bookFilter}")
	public String requestBooksByFilter(
	@MatrixVariable(pathVar="bookFilter") Map<String, List<String>> bookFilter,
	Model model) {
		System.out.println("📌 bookFilter 호출됨!");
	    System.out.println("👉 booksByFilter값: " + bookFilter);
		Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
		model.addAttribute("bookList", booksByFilter);
		return "books";
	}
	
	@GetMapping("/book")
	public String requestBookById(@RequestParam("id") String bookId, Model model) {
		Book bookById = bookService.getBookById(bookId);
		model.addAttribute("book", bookById);
		return "book";
	}
}
