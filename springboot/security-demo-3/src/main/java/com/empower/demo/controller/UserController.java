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

import com.empower.demo.util.AuthRequest;

@RestController
@RequestMapping("/api/v2")
public class UserController {
	@Autowired
	private AuthenticationManager am;

	@PostMapping("/login")
	public String login(@RequestBody AuthRequest ar) {
		String msg="Login failed";
		Authentication result = am.authenticate(new UsernamePasswordAuthenticationToken(ar.getUsername(), ar.getPassword()));
		if(result.isAuthenticated()) {
			msg="Login successful";
		}else {
			throw new UsernameNotFoundException("");
		}
		return msg;
	}
}
