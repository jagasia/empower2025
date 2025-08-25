package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String home() {
		return "welcome home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "About us";
	}
}
