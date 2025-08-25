package com.empower.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.MyUser;
import com.empower.demo.repository.MyUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private MyUserRepository mur;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> temp = mur.findById(username);
		User user=null;
		if(temp.isPresent()) {
			//convert myuser into predefined user
			MyUser myUser = temp.get();
			user=new User(username, myUser.getPassword(), new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Login failed");
		}
		return user;
	}
	
	
}
