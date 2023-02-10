package com.skilloVilla.service;

import com.skilloVilla.exception.BookException;
import com.skilloVilla.exception.UserException;

public interface LibraryLogService {

	public String issueBook(Integer issuerId, Integer bookId) throws UserException, BookException;
	public String returnBook(Integer issuerId, Integer bookId) throws UserException, BookException;
	
}
