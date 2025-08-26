package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.Food;
import com.empower.demo.api.FoodApi;

@RestController
@RequestMapping("/client")
public class MyController {
	@Autowired
	private FoodApi fapi;
	
	@GetMapping
	public String home() {
		return "Hi this my client service";
	}
	
	@GetMapping("/food")
	public List<Food> getAllFoods() {
		return fapi.read();
	}
	
	@GetMapping("/food/{id}")
	public Food findFoodById(@PathVariable Long id) {
		return fapi.read(id);
	}
	
}
