package com.userservice.services;

import java.util.List;

import com.userservice.entities.User;

public interface UserService {
	
	//creating a user
	
	User saveUser(User user);
	
	//get All user
	
	List<User> getAllUser();
	
	//get single user
	
	User getUserByuserId(String userId);

}
