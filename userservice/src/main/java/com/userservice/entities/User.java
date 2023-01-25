package com.userservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class User {
	
	@Id
	
	@Column(name="ID" , length = 10)
	private String userId;
	
	@Column(name="NAME" , length = 20)
	private String name;
	
	@Column(name="EMAIL",length = 30)
	private String email;
	
	@Column(name="ABOUT" , length = 50)
	private String about;
	
	@Transient
	private BootService bookService;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public BootService getBookService() {
		return bookService;
	}
	public void setBookService(BootService bookService) {
		this.bookService = bookService;
	}
	
	
	
	

}
