package com.in28minutes.login;

import org.springframework.stereotype.Service;
import com.in28minutes.model.Customer;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("sumana shaw") && password.equals("admin");
	
	}

}