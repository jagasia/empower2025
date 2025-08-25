package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String home() {
		return "Home page";
	}
	
	@GetMapping("/about")
	public String aboutUs() {
		return "About us page";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		return "Contact us page";
	}
	
	
}
