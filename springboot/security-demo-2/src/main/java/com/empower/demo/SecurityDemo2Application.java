package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude = SecurityAutoConfiguration.class)
public class SecurityDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemo2Application.class, args);
	}

}
