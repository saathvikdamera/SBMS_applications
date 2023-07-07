package com.Damera.rest;

import java.util.HashMap;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Damera.binding.User;

@RestController
public class UserRestController {
	
	private Map<Integer, User> map = new HashMap<>();
	
	//sending data in request body
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user){
		System.out.println(user);
		map.put(user.getId(), user);
		return new ResponseEntity<String>("User Saved",HttpStatus.CREATED);
	}
	
	//Getting data in query parameter
	@GetMapping("/user")
	public User sendUser(@RequestParam Integer id) {
		User user = map.get(id);
		return user;
	}
	
	//Getting data in path parameter
	@GetMapping("/user/{id}/data")
	public User getUser(@PathVariable Integer id) {
		User user = map.get(id);
		return user;
	}

}
