package com.Damera.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Damera.AppConfig;
import com.Damera.service.ReportService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService bean = ctxt.getBean(ReportService.class);
		bean.fetchData();

	}

}
