package com.damera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServerRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerRestApiApplication.class, args);
	}

}
