package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Product;
import com.empower.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return ps.addProduct(product);
	}
	
	@GetMapping("/category/{category}")
	public List<Product> findProductsByCategory(@PathVariable("category") String category) {
		return ps.findProductByCategory(category);
	}
	
	@GetMapping("/{from}/{to}")
	public List<Product> findProductsByPriceRange(@PathVariable Double from,@PathVariable Double to){
		return ps.findProductsByPriceRange(from, to);
	}
}
