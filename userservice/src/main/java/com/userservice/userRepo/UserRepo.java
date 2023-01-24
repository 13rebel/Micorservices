package com.userservice.userRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.entities.User;

public interface UserRepo extends JpaRepository<User, String> {

}
