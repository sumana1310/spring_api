package com.in28minutes.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.User;
@Service
public class UserServiceimpl implements UserService {
	private List<User> users = 
			 new ArrayList<>( Arrays.asList(
					 new User("sumana13","sumanashaw1310gmail.com","admin12345",true)));

	@Override
	public List<User> getAllUsers() {
		
		return users;
	}

	/*
	 * @Override public void deleteUser(String userId) { users.remove()
	 */
	

	@Override
	public void addUser(User user) {
	users.add(user);
	}

	/*
	 * @Override public User getUserById(String userId) { // TODO Auto-generated
	 * method stub return null; }
	 */

}
