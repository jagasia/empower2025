package com.empower.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int create(Product product) {
		return jt.update("INSERT INTO PRODUCT VALUES(?,?,?,?)",product.getId(), product.getName(), product.getCategory(), product.getPrice());
	}
	@Override
	public List<Product> read() {
		return jt.query("SELECT * FROM PRODUCT", new ProductRowMapper());
	}
	@Override
	public Product read(Long id) {
		return jt.queryForObject("SELECT * FROM PRODUCT WHERE ID=?", new ProductRowMapper(), id);
	}
	@Override
	public int update(Product product) {
		return jt.update("UPDATE PRODUCT SET NAME=?, CATEGORY=?, PRICE=? WHERE ID=?", product.getName(), product.getCategory(), product.getPrice(), product.getId());
	}
	@Override
	public int delete(Long id) {
		return jt.update("DELETE FROM PRODUCT WHERE ID=?", id);
	}
	
}
