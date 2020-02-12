package com.in28minutes.service;

import java.util.List;

import com.in28minutes.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	

}
