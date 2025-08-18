package com.empower.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com","com.empower"})
public class MyConfiguration {

	@Bean
//	@Scope("prototype")
	public Sony sony() {
		return new Sony();
	}
}
