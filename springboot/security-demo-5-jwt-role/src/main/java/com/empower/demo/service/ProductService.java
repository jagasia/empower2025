package com.empower.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Product;
import com.empower.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product addProduct(Product product) {
		return pr.save(product);
	}
	
	public List<Product> retrieveAllProducts() {
		return pr.findAll();
	}
	
	public List<Product> findProductByCategory(String category) {
		return pr.findByCategory(category);
	}
	
	public List<Product> findProductsByPriceRange(Double from, Double to) {
		return pr.findByPriceRange(from, to);
	}
}
