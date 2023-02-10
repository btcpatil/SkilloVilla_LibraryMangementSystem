package com.skilloVilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilloVilla.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
