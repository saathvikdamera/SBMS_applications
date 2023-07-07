package com.damera.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.damera.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Autowired
	private UserService service;
	
	@Autowired
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.userDetailsService(service)
		        .passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(req -> 
		                                req.antMatchers("/hi")
		                                   .permitAll()
		                                   .anyRequest()
		                                   .authenticated()
		                                   ).formLogin();
		
		return http.build();
	}
	
}
