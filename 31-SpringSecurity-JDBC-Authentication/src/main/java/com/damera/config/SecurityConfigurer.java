package com.damera.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	public static final String ADMIN ="ADMIN";
	public static final String USER ="USER";
	
	@Autowired
	private DataSource datasource;
	
	@Autowired
	public void authManager(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		    .dataSource(datasource)
		    .passwordEncoder(new BCryptPasswordEncoder())
		    .usersByUsernameQuery("select username,password,enabled from users where username=?")
	      	.authoritiesByUsernameQuery("select username,authority from authorities where username=?");
	}

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((req) -> req.antMatchers("/contact").permitAll()
                .antMatchers("/admin").hasRole(ADMIN)
                .antMatchers("/user").hasAnyRole(USER, ADMIN)
                .anyRequest().authenticated()).formLogin(withDefaults());
		return http.build();
	}

}
