package com.bookservice.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookservice.entities.Book;
import com.bookservice.repo.BookRepo;
import com.bookservice.services.BookService;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public Book saveBook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> findAll = bookRepo.findAll();
		return findAll;
	}

	@Override
	public Book getBookBybookId(int bookId) {
		Book book = bookRepo.findById(bookId).get();
		return book;
	}

}
