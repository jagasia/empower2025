package com.empower.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_MASTER")
public class MyUser {
	@Id
	private String username;
	private String password;
	@Column(name = "NAME")
	private String fullName;
	private String role;	//csv for ex, admin,user
	
	public MyUser() {}

	public MyUser(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	
	

	public MyUser(String username, String password, String fullName, String role) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", fullName=" + fullName + ", role=" + role
				+ "]";
	}

	
}
