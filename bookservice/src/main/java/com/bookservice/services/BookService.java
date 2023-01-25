package com.bookservice.services;

import java.util.List;

import com.bookservice.entities.Book;

public interface BookService {
	
	//for save the book in database
	Book saveBook(Book book);
	
	//get all book
	
	List<Book> getAllBook();
	
	//get single book by bookid
	
	Book getBookBybookId(int bookId);
	

}
