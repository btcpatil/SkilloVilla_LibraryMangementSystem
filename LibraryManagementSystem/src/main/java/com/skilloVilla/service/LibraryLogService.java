package com.skilloVilla.service;

import java.time.LocalDate;

import com.skilloVilla.exception.BookException;
import com.skilloVilla.exception.UserException;

public interface LibraryLogService {

	public String issueBook(Integer userId, Integer bookId) throws UserException, BookException;
	public String returnBook(Integer userId, Integer bookId, LocalDate returnDate) throws UserException, BookException;
	
}
