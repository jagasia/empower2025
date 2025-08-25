package com.empower.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.empower.demo.filter.JwtAuthFilter;
import com.empower.demo.service.MyUserDetailsService;

@Configuration
public class MySecurityConfiguration {
	@Autowired
	private JwtAuthFilter filter;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    return http.csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(auth -> auth
	                    .requestMatchers("/api/v1/**","/api/v2/**").permitAll()
//	                    .requestMatchers("/api/v2/**").authenticated()
	                    .anyRequest().authenticated()
//	                    .anyRequest().denyAll() // optional: deny everything else
	            )
	            .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	            .authenticationProvider(authenticationProvider())
	            .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
	            .build();
	}


//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new MyUserDetailsService();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider ap=new DaoAuthenticationProvider();
		ap.setUserDetailsService(userDetailsService());
		ap.setPasswordEncoder(passwordEncoder());
		return ap;
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}
}
