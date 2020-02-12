package com.in28minutes.dao;
import com.in28minutes.RowMapper.ProductRowMapper;
import com.in28minutes.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Component
public class ProductDaoimpl implements ProductDao {

 JdbcTemplate jdbcTemplate= new JdbcTemplate();

	@Transactional
	public List<Product> getAllProducts() {
		List<Product> products = (List<Product>) jdbcTemplate.query("select * from item",
				new ProductRowMapper());
		return products;
	}

}
