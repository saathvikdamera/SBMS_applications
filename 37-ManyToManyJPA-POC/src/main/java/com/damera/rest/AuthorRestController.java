package com.damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damera.entity.AuthorEntity;
import com.damera.repo.AuthorRepository;

@RestController
@RequestMapping("/author")
public class AuthorRestController {
	
	@Autowired
	private AuthorRepository repo;
	
	@GetMapping("/{id}")
	public AuthorEntity getAuthor(@PathVariable("id") Integer Id) {
		return repo.findByAuthorId(Id);
	}

}
