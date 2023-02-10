package com.skilloVilla.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilloVilla.model.LibraryLog;

public interface LibraryLogRepository extends JpaRepository<LibraryLog, Integer>{

	public Optional<LibraryLog> findByIssuerIdAndBookId(Integer issuerId, Integer bookId);
	
}
