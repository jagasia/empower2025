package com.empower.demo.util;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class AuthResponse {
	private String username;
	private String jwtToken;
	private Collection<? extends GrantedAuthority> authorities;
	
	public AuthResponse(String username, String jwtToken, Collection<? extends GrantedAuthority> authorities) {
		this.username=username;
		this.jwtToken=jwtToken;
		this.authorities=authorities;
	}

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
	
	

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "AuthResponse [username=" + username + ", jwtToken=" + jwtToken + ", authorities=" + authorities + "]";
	}

	
}
