package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityDemo1Application {

	@GetMapping
	public String home() {
		return "Hello welcome to home";
	}
	
	@GetMapping("/about")
	public String aboutUs() {
		return "About us";
	}
	
	@GetMapping("/contact")
	public String contactUs() {
		return "Contact us";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityDemo1Application.class, args);
	}

}
