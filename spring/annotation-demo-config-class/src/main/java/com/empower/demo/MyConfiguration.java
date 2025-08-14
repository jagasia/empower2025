package com.empower.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com","com.empower"})
public class MyConfiguration {

	@Bean
	public Sony sony() {
		return new Sony();
	}
}
