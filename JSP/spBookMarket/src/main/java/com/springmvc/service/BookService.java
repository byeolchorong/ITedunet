package com.springmvc.service;

import java.util.List;
import com.springmvc.domain.Book;
import org.springframework.stereotype.Service;
import com.springmvc.repository.BookRepository;

@Service
public interface BookService {
	List<Book> getAllBookList();
}
