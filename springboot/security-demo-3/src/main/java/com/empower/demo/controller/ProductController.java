package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/product")
public class ProductController {

	@GetMapping
	public String getAllProducts() {
		return "returning all products";
	}
	
	@GetMapping("/{id}")
	public String findProductById(@PathVariable Long id) {
		return "found a product for given id: "+id;
	}
}
