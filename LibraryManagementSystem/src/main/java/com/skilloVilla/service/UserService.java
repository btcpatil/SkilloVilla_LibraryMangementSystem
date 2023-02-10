package com.skilloVilla.service;

import java.util.Optional;

import com.skilloVilla.exception.UserException;
import com.skilloVilla.model.User;

public interface UserService {
 
	public User addUser(User user) throws UserException;
	public Optional<User> findUserById(Integer userId);
}
