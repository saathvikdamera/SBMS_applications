package com.Damera.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Damera.binding.Book;

@RestController
public class BookRestController {

	@PostMapping(value = "/book", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		System.out.println(book);
		String msg = "Record saved";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/book", produces = { "application/json", "application/xml" })
	public Book getBook() {

		Book book = new Book();
		book.setId(102);
		book.setName("Spring Boot");
		book.setPrice(800.0);

		return book;
	}
}
