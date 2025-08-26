package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CustomerApiApplication {

	@GetMapping("/customer")
	public String home() {
		return "Customer home";
	}
	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApplication.class, args);
	}

}
