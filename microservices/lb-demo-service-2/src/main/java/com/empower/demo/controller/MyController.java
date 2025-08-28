package com.empower.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Value("${server.instance.id}")
	String instanceId;

	@GetMapping
	public String home() {
		return "Hello, this is "+instanceId;
	}
}
