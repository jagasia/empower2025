package com.empower.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/product")
public class ProductController {

	@GetMapping
	@PreAuthorize("hasAnyAuthority('user','admin')")
	public String getAllProducts() {
		return "returning all products";
	}
	
	@PreAuthorize("hasAnyAuthority('user','admin')")
	@GetMapping("/{id}")
	public String findProductById(@PathVariable Long id) {
		return "found a product for given id: "+id;
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('admin')")
	public String addProduct() {
		return "adding Product";
	}
	
	
	@PutMapping
	@PreAuthorize("hasAuthority('admin')")
	public String updateProduct() {
		return "updating product";
	}
	
	@DeleteMapping
	@PreAuthorize("hasAuthority('user')")
	public String removeProduct() {
		return "removing Product";
	}
}
