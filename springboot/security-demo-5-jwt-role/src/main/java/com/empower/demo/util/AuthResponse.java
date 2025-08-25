package com.empower.demo.util;

public class AuthResponse {
	private String username;
	private String jwtToken;
	
	public AuthResponse() {}

	public AuthResponse(String username, String jwtToken) {
		super();
		this.username = username;
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString() {
		return "AuthResponse [username=" + username + ", jwtToken=" + jwtToken + "]";
	}
	
}
