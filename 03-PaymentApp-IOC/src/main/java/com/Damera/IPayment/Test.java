package com.Damera.IPayment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Bean.xml");
		PaymentService bean = ctxt.getBean(PaymentService.class);
		bean.doPayment(200.0);

	}

}
