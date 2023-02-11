package com.skilloVilla.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilloVilla.exception.UserException;
import com.skilloVilla.model.User;
import com.skilloVilla.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public User addUser(User user) throws UserException {
		
		Optional<User> userOptional = userRepo.findByUserEmail(user.getUserEmail());
		if(userOptional.isPresent()) throw new UserException("This user is already registered");
		else return userRepo.save(user);
	}

	@Override
	public Optional<User> findUserById(Integer userId){
		
		 return userRepo.findById(userId);
		
	}

}
