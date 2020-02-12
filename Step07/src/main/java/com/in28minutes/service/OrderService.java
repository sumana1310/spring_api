package com.in28minutes.service;

import com.in28minutes.model.Order;
	public interface OrderService {

		void addCustomerOrder(Order order);
		double getCustomerOrderGrandTotal(String cartId);
	}


