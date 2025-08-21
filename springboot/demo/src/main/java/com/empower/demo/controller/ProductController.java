package com.empower.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping
	public Product getProduct() {
		return new Product(1L, "Pen", "Stationery", 12.2);
	}
	
//	@PostMapping
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public Product addProduct(@RequestBody Product product) {
		return product;
	}
	
	@PutMapping("/{id}")
	public Product addProduct(@PathVariable("id")Long id, @RequestBody Product product) {
		return new Product(id, "Pen", "Stationery", 12.2);
	}
	
	@DeleteMapping("/{id}")
	public Product addProduct(@PathVariable("id")Long id) {
		return new Product(id, "Pen", "Stationery", 12.2);
	}
	
}
