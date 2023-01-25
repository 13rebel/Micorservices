package com.bookservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookservice.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
