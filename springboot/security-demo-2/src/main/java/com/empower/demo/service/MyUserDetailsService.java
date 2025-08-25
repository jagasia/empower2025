package com.empower.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		ArrayList<User> users=new ArrayList<>();
		users.add(new User("mithun","abcd", new ArrayList<>()));
		users.add(new User("hrithik","abcd", new ArrayList<>()));
		users.add(new User("harinath","abcd", new ArrayList<>()));
		users.add(new User("samarth","abcd", new ArrayList<>()));
		users.add(new User("adharv","abcd", new ArrayList<>()));
		
		User user=null;
		for(User u:users) {
			if(u.getUsername().equals(username)) {
				user=u;
			}
		}
		
		if(user==null) {
			throw new UsernameNotFoundException("Login failed");
		}
		
		return user;
	}

}
