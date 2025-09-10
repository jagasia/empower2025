package com.empower.demo.model;

import java.util.List;

public interface ProductDao {

	int create(Product product);

	List<Product> read();

	Product read(Long id);

	int update(Product product);

	int delete(Long id);

	String createTables();

}