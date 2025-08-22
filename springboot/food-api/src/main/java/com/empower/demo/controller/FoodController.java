package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Food;
import com.empower.demo.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	private FoodService fs;
	
	@PostMapping
	public Food create(@RequestBody Food food) {
		System.out.println(food);
		return fs.create(food);
	}
	
	@GetMapping
	public List<Food> read() {
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Food read(@PathVariable Long id) {
		return fs.read(id);
	}
	
	@PutMapping("/{id}")
	public Food update(@PathVariable Long id, @RequestBody Food food) {
		return fs.update(food);
	}
	
	@DeleteMapping("/{id}")
	public Food delete(@PathVariable Long id) {
		return fs.delete(id);
	}
	
}
