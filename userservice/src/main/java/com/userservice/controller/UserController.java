package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.entities.User;
import com.userservice.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	//creating a user
	public User createUser(@RequestBody User user) {
		
		User saveUser = this .userService.saveUser(user);
		return saveUser;
		
		
	}
	//Geting all user
	@GetMapping("/")
	public List<User> getAllUser(){
		
		List<User> allUser = this.userService.getAllUser();
		return allUser;
	}
	//get user by user Id
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable String userId) {
		
		User userByuserId = this.userService.getUserByuserId(userId);
		return userByuserId;
	}
	
	

}
