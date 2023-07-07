package com.damera.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damera.entity.UserDtls;
import com.damera.request.UserDTO;
import com.damera.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService service;

	@PostMapping("/save")
	public UserDtls createUser(@RequestBody @Valid UserDTO dto) {
		return service.saveUser(dto);
	}
	
	@GetMapping("/{id}")
	public UserDtls getUser(@PathVariable Integer id) {
		return service.getUserById(id);
	}
	
}
