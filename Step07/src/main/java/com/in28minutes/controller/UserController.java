package com.in28minutes.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.in28minutes.model.*;
import com.in28minutes.service.*;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	

	@RequestMapping(value = "/registration",method = RequestMethod.GET)
	public String getRegistrationForm() {
	return "register";
	}
	
	// to insert the data
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerCustomer(ModelMap model, @Valid User user,
			BindingResult result) {
		if (result.hasErrors())
			return "register";
		userService.addUser(user);
		model.put("registrationSuccess", "Registered Successfully. Login using username and password");
		return "login";
	}
}