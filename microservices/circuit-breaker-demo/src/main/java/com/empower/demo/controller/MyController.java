package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyController {

	@GetMapping
	public String home() {
		return "Hello world";
	}

	@GetMapping("/product")
	@CircuitBreaker(name="jag", fallbackMethod = "fallbackMethod")
	public String callProductApi() {
		RestTemplate rt = new RestTemplate();
		return rt.getForObject("http://localhost:5002/product", String.class);
	}

	public String fallbackMethod(Throwable throwable) {
		return "This is fallbakc method";
	}
}
