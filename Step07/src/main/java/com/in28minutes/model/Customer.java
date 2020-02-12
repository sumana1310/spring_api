package com.in28minutes.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	public Customer(String customerId, String name, String customerPhone) {
		super();
		this.customerId = customerId;
		Name = name;
		this.customerPhone = customerPhone;
		/*
		 * this.shippingAddress = shippingAddress; this.cart = cart;
		 */
	}
	public Customer() {
		
	}

	private static final long serialVersionUID = 2652327633296064143L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	private String Name;
	
	private String customerPhone;

	/*
	 * @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "shippingAddressId") private ShippingAddress
	 * shippingAddress;
	 * 
	 * 
	 * 
	 * @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "cartId") private Cart cart;
	 * 
	 * 
	 * 
	 * 
	 * public Cart getCart() { return cart; }
	 * 
	 * public void setCart(Cart cart) { this.cart = cart; }
	 */

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String custmerId) {
		this.customerId = custmerId;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	/*
	 * public ShippingAddress getShippingAddress() { return shippingAddress; }
	 * 
	 * public void setShippingAddress(ShippingAddress shippingAddress) {
	 * this.shippingAddress = shippingAddress; }
	 */
	public String Name() {
		return Name;
	}

	public void Name(String Name) {
		this.Name = Name;
	}

	

	
}