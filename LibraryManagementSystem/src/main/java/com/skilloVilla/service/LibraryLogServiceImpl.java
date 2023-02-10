package com.skilloVilla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilloVilla.exception.BookException;
import com.skilloVilla.exception.UserException;
import com.skilloVilla.model.Book;
import com.skilloVilla.model.User;
import com.skilloVilla.repository.BookRepository;
import com.skilloVilla.repository.LibraryLogRepository;
import com.skilloVilla.repository.UserRepository;

@Service
public class LibraryLogServiceImpl implements LibraryLogService{

	@Autowired
	LibraryLogRepository libraryLogRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	@Override
	public String issueBook(Integer issuerId, Integer bookId) throws UserException, BookException {
		
		User existingUser = userRepo.findById(issuerId).orElseThrow(() -> new UserException("Invalid userId"));
		Book existingBook = bookRepo.findById(bookId).orElseThrow(() -> new BookException("Invalid bookId"));
		
		existingBook.setAvailability(false);
		existingUser.getBookList().add(existingBook);
		return null;
	}

	@Override
	public String returnBook(Integer issuerId, Integer bookId) throws UserException, BookException {
		// TODO Auto-generated method stub
		return null;
	}

}
