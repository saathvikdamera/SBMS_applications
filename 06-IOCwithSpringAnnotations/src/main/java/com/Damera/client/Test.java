package com.Damera.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Damera.AppConfig;
import com.Damera.beans.Robot;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		Robot bean = ctxt.getBean(Robot.class);
		bean.startAction();
	}

}
