package com.damera.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.damera.request.ApiError;

@RestControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value = NoProductFoundException.class)
	public ResponseEntity<ApiError> handleNoProductFoundException(NoProductFoundException ex){
		ApiError error = new ApiError(400, ex.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);
	}
	
	
}
