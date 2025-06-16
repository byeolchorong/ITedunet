package com.springmvc.service;

import com.springmvc.domain.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBookList() {
		return bookRepository.getAllBookList();
	}
}
