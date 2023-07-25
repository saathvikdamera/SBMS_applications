package com.damera.service;

import org.springframework.stereotype.Service;

import com.damera.entity.Book;

@Service
public class UserService{
	
	public String getMsg() {
		return "Welcome to Hyderabad";
	}
	
	public boolean saveBook(Book book) {
		return true;
	}

}
