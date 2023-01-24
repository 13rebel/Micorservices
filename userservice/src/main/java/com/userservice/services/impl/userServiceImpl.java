package com.userservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.entities.User;
import com.userservice.services.UserService;
import com.userservice.userRepo.UserRepo;

@Service
public class userServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		
		return this.userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		List<User> findAll = this.userRepo.findAll();
		
		return findAll;
	}

	@Override
	public User getUserByuserId(String userId) {
		User user = this.userRepo.findById(userId).get();
		return user ;
	}

}
