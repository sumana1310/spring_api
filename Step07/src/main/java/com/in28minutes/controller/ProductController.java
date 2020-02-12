package com.in28minutes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import com.in28minutes.model.Product;
import com.in28minutes.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	
	 @RequestMapping(value="/product", method = RequestMethod.GET) 
	 public ModelAndView getAllProducts() {
		 
		 System.out.println("product controller");
		  List<Product> products = productservice.getAllProducts();

		  return new
		  ModelAndView("product","products",products); }
}
