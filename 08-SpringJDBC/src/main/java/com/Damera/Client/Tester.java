package com.Damera.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Damera.AppConfig;
import com.Damera.Service.UserService;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = ctxt.getBean(UserService.class);
		bean.saveUser(2214, "vishal", "penchala", 23);

	}
}
