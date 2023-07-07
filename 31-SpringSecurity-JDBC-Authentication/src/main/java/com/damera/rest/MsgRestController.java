package com.damera.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome admin..";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome user..";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact us - +91 80 08 12 91 72";
	}

}
