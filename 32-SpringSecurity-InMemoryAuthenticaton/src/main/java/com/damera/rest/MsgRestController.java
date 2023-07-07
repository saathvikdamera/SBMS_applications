package com.damera.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/hello")
	public String HelloMSg() {
		return "Hello";
	}

}
