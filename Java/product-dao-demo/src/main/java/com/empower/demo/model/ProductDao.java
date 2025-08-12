package com.empower.demo.model;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {

	int create(Product product) throws SQLException;

	List<Product> read() throws SQLException;

	Product read(Long id) throws SQLException;

	int update(Product product) throws SQLException;

	int delete(Long id) throws SQLException;

}