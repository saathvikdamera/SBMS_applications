package com.damera.handler;

import java.time.LocalDateTime;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.damera.exception.NoUserFoundException;

@RestControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleValidationException(MethodArgumentNotValidException ex){
		Map<String,String> errors = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> 
		{errors.put(error.getField(), error.getDefaultMessage());} );
		return new ResponseEntity<Map<String,String>>(errors, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = NoUserFoundException.class)
	public ResponseEntity<Map<String,String>> handleUserNotFoundException(NoUserFoundException ex){
		Map<String,String> errors = new HashMap<>();
		errors.put("error code", "500");
		errors.put("error msg", ex.getMessage());
		errors.put("date",String.valueOf(LocalDateTime.now()));
		return new ResponseEntity<Map<String,String>>(errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
