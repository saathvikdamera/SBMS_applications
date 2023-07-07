package com.damera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Bean
	InMemoryUserDetailsManager configure() {
		
		UserDetails adminUser = User.withDefaultPasswordEncoder()
				.username("saathvik")
				.password("damera")
				.authorities("ADMIN")
				.build();
		
		UserDetails nrmlUser = User.withDefaultPasswordEncoder()
				.username("user")
				.password("12345")
				.authorities("USER")
				.build();
		
		return new InMemoryUserDetailsManager(adminUser,nrmlUser);
	}

}
