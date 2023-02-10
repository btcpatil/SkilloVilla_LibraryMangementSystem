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

import com.skilloVilla.exception.UserException;
import com.skilloVilla.model.User;
import com.skilloVilla.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/registerUser")
	public ResponseEntity<User> registerUser(@RequestBody User user) throws UserException {
	    User savedUser =  userService.addUser(user);
	    return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/gerUser/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Integer userId) throws UserException{
		return userService.findUserById(userId)
				          .map(ResponseEntity::ok)
				          .orElseGet(() -> ResponseEntity.notFound().build());
	}
}
