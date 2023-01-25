package com.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bookservice.entities.Book;
import com.bookservice.services.BookService;

public class BookController {
	
	@Autowired
	private BookService bookServicce;
	
	@PostMapping("/book")
	 public Book saveBook(@RequestBody Book book) {
		
		Book saveBook = bookServicce.saveBook(book);
		return saveBook;
		
	}
	
	@GetMapping("/")
	public List<Book> getAllBook(){
		
		List<Book> allBook = bookServicce.getAllBook();
		
		return allBook;
	}
	
	@GetMapping("/book/{bookId}")
	public Book getBookById(@PathVariable int bookId) {
		
		Book bookBybookId = bookServicce.getBookBybookId(bookId);
		return bookBybookId;
	}

}
