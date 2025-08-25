package com.empower.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.service.JwtService;
import com.empower.demo.util.AuthRequest;
import com.empower.demo.util.AuthResponse;

@RestController
@RequestMapping("/api/v2")
public class UserController {
	@Autowired
	private AuthenticationManager am;
	
	@Autowired
	private JwtService jwtService;

	@PostMapping("/login")
	public AuthResponse login(@RequestBody AuthRequest ar) {
		AuthResponse response=null;
		Authentication result = am.authenticate(new UsernamePasswordAuthenticationToken(ar.getUsername(), ar.getPassword()));
		if(result.isAuthenticated()) {
			String jwtToken=jwtService.generateToken(ar.getUsername());
			response=new AuthResponse(ar.getUsername(), jwtToken);			
		}else {
			throw new UsernameNotFoundException("");
		}
		return response;
	}
}
