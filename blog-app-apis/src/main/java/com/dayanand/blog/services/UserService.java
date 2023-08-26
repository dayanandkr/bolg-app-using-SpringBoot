package com.dayanand.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dayanand.blog.payloads.UserDto;
import com.dayanand.blog.repository.UserRepo;


public interface UserService{
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);

}
