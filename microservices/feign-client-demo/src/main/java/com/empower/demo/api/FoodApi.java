package com.empower.demo.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.demo.Food;

@FeignClient(value = "food-api", url = "http://localhost:5000/food")
public interface FoodApi {

	@PostMapping
	public Food create(@RequestBody Food food);
	
	@GetMapping
	public List<Food> read();
	
	@GetMapping("/{id}")
	public Food read(@PathVariable Long id);
	
	@PutMapping("/{id}")
	public Food update(@PathVariable Long id, @RequestBody Food food);
	
	@DeleteMapping("/{id}")
	public Food delete(@PathVariable Long id);
}
