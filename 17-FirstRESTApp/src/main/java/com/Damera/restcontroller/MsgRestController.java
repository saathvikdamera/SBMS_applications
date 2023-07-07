package com.Damera.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Evening...";
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg = "Welcome to REST Api...";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg(){
		//logic to save msg
		
		String msg = "Msg saved successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}

}
