package com.damera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.damera.entity.Book;
import com.damera.service.UserService;

@RestController
public class MsgRestController {
	
	@Autowired
	private UserService service;

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		return new ResponseEntity<>(service.getMsg(),HttpStatus.OK);
	}
	
	@PostMapping("/books")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		
		boolean saveBook = service.saveBook(book);
		
		if(saveBook) {
			return new ResponseEntity<>(HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
