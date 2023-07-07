package com.Damera.User;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserService bean = ctxt.getBean(UserService.class);
		bean.printName(1);

	}

}
