package com.in28minutes.service;

import java.util.List;

import com.in28minutes.model.User;

public interface UserService {

	List<User> getAllUsers();
	
	/*
	 * void deleteUser(String userId);
	 */
	void addUser(User user);
	
	/* User getUserById(String userId); */
}


 