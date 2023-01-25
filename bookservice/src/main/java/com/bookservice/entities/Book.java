package com.bookservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
