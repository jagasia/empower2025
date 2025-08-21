package com.empower.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home() {
		return "Hello world";
	}
	
	@GetMapping("/{id}/{name}/{category}")
	public String kethanMethod(@PathVariable Long id, @PathVariable String category, @PathVariable String name) {
		return ""+id+":"+category+":"+name;
	}
	
	@PostMapping
	public String addProduct() {
		return "Adding product";
	}
	
	@PutMapping("/{id}")
	public String updateProduct(@PathVariable("id")Long id) {
		return "Updating product";
	}
	
	
	@DeleteMapping("/{id}")
	public String removeProduct(@PathVariable("id") Long id) {
		return "Product is removed";
	}
}
