package com.in28minutes.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.in28minutes.dao.*;
import com.in28minutes.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.in28minutes.model.Product;
@Component
public class ProductServiceimpl implements ProductService {

	  @Autowired private ProductDao productdao;
	 
	  public ProductDao getProductdao() { return productdao; }
	 
	  public void setProductdao(ProductDao productdao) { 
		  this.productdao = productdao; }
	 

@Transactional
	public List<Product> getAllProducts() {
	
		return productdao.getAllProducts();
	}

	
	


}
