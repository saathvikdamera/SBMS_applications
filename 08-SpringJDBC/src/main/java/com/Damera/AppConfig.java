package com.Damera;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class AppConfig {
	
	//@Autowired
//	Environment environment;
	
	private final String URL = "jdbc:mysql://localhost:3306/springboot";
	private final String USER = "root";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String PASSWORD = "1234";
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(DRIVER);
		dmds.setUrl(URL);
		dmds.setUsername(USER);
		dmds.setPassword(PASSWORD);
		return dmds;
	}

}
