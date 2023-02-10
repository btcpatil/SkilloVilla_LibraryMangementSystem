package com.skilloVilla.service;

import java.util.Optional;

import com.skilloVilla.model.Book;

public interface BookService {
 
	public Book addBook(Book book);
	public Optional<Book> findUserById(Integer bookId);
}
