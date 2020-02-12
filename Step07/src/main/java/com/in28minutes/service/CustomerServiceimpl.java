package com.in28minutes.service;
import java.util.*;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.*;
@Service
public class CustomerServiceimpl implements CustomerService {
	private List<Customer> customers = 
			 new ArrayList<>( Arrays.asList(
					 new Customer("C100","sumana","1234567890")));

	@Override
	public void addCustomer(Customer customer) {
	customers.add(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}
	
}
