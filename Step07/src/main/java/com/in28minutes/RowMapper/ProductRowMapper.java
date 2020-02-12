package com.in28minutes.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.in28minutes.model.*;

public class ProductRowMapper implements RowMapper<Product>  {
	public Product mapRow(ResultSet rs, int row) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getString("Id"));
		product.setProductCategory(rs.getString("category"));
		product.setProductDescription(rs.getString("description"));
		product.setProductName(rs.getString("name"));
		product.setProductPrice(rs.getDouble("price"));
		return product;
	}

}
