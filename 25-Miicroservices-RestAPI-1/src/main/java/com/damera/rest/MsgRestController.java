package com.damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damera.feign.MsgFeignClient;

@RestController
public class MsgRestController {
	
	@Autowired
	private MsgFeignClient client;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String greetMsg = client.getGreetMsg();
		
		return greetMsg + " , Welcome to Ashok It";
	}

}
