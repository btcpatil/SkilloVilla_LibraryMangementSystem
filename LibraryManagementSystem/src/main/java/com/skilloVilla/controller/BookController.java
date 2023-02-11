package com.skilloVilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilloVilla.model.Book;
import com.skilloVilla.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
 
	@Autowired
	BookService bookService;
	
	@PostMapping("/addNewBook")
	public ResponseEntity<Book> addNewBook(@RequestBody Book book){
	    Book savedBook =  bookService.addBook(book);
	    return new ResponseEntity<Book>(savedBook,HttpStatus.CREATED);
	}
	
	@GetMapping("/getBook/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable Integer bookId){
		return bookService.findBookById(bookId)
				          .map(ResponseEntity::ok)
				          .orElseGet(() -> ResponseEntity.notFound().build());
	}
}
