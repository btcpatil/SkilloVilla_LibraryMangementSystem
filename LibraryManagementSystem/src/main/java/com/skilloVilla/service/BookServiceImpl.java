package com.skilloVilla.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilloVilla.model.Book;
import com.skilloVilla.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Book addBook(Book book){
		
		return bookRepo.save(book);
	}

	@Override
	public Optional<Book> findUserById(Integer bookId){
	 	return bookRepo.findById(bookId);
	}

}
