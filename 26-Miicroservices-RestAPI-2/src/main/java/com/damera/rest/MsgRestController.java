package com.damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		String port = env.getProperty("server.port");
		
		return "Good evening ("+port+")";
	}

}
