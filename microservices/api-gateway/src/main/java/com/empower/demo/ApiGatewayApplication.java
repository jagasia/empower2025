package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
	    return builder.routes()
	      .route("r1", r -> r.host("**localhost:5000")
		        .and()
		        .path("/customer")
	        	        .uri("http://localhost:5001"))
	      .route("r2", r -> r.host("**localhost:5000")
	  	        .and()
	  	        .path("/product")
	  	        .uri("http://localhost:5002"))
	    .build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
