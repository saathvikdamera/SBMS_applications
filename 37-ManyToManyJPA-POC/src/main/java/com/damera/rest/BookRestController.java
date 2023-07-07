package com.damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damera.entity.BookEntity;
import com.damera.repo.BookRepository;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/{id}")
	public BookEntity getBook(@PathVariable Integer id) {
		return bookRepo.findByBookId(id);
	}

}
