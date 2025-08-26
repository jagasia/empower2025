package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.empower.demo.Food;

@RestController
public class MyController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String home() {
		return "Hello world";
	}
	
	@GetMapping("/food/{id}")
	public Food findFoodById(@PathVariable Long id) {
		//how to call http://localhost:5000/food/1
		//use RestTEmplate
		RestTemplate rt=new RestTemplate();
		Food food = rt.getForObject("http://localhost:5000/food/"+id, Food.class);
		return food;
	}
	
	@GetMapping("/food")
	public List<Food> getAllFoods() {
	    String url = "http://localhost:5000/food";
	    RestTemplate rt=new RestTemplate();
	    ResponseEntity<List<Food>> response = rt.exchange(
	            url,
	            HttpMethod.GET,
	            null,
	            new ParameterizedTypeReference<List<Food>>() {}
	    );

	    return response.getBody();
	}
	
	
}
