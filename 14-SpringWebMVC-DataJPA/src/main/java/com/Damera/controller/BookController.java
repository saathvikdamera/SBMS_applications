package com.Damera.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Damera.entity.Book;
import com.Damera.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView  getBook(@RequestParam("id")Integer id) {
		ModelAndView mav = new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		if(findById.isPresent()) {
			Book book = findById.get();
			mav.addObject("book", book);
		}
		mav.setViewName("index"); 
		return mav;
	}
	
	

}
