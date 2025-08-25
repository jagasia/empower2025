package com.empower.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.MyUser;
import com.empower.demo.repository.MyUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private MyUserRepository mur;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> temp = mur.findById(username);
		User user = null;
		if (temp.isPresent()) {
			// convert myuser into predefined user
			MyUser myUser = temp.get();
			String role = myUser.getRole();
			String[] arr = role.split(",");
			List<GrantedAuthority> list = new ArrayList<>();
			for (String x : arr) {
				list.add(new SimpleGrantedAuthority(x));
			}
			user = new User(username, myUser.getPassword(), list);
		} else {
			throw new UsernameNotFoundException("Login failed");
		}
		return user;
	}

	public MyUser addUser(MyUser user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return mur.save(user);
	}
}
