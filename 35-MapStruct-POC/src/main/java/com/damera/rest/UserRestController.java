package com.damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.damera.entity.UserDtls;
import com.damera.request.UserDTO;
import com.damera.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public ResponseEntity<UserDtls> saveUser(@RequestBody UserDTO dto){
		UserDtls user = service.saveUser(dto);
		return new ResponseEntity<UserDtls>(user, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public UserDTO getUser(@PathVariable Integer id) {
		return service.getUserById(id);
	}
}
