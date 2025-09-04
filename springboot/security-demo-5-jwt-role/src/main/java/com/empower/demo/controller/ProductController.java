package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Product;
import com.empower.demo.service.ProductService;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/api/v3/product")
public class ProductController {
	@Autowired
	private ProductService ps;

	@GetMapping
	@PreAuthorize("hasAnyAuthority('user','admin')")
	public List<Product> getAllProducts() {
		return ps.retrieveAllProducts();
	}
	
	@PreAuthorize("hasAnyAuthority('user','admin')")
	@GetMapping("/{id}")
	public String findProductById(@PathVariable Long id) {
		return "found a product for given id: "+id;
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('admin')")
	public Product addProduct(@RequestBody Product product) {
		return ps.addProduct(product);
	}
	
	
	@PutMapping
	@PreAuthorize("hasAuthority('admin')")
	public String updateProduct() {
		return "updating product";
	}
	
	@DeleteMapping
	@PreAuthorize("hasAuthority('admin')")
	public String removeProduct() {
		return "removing Product";
	}
}
