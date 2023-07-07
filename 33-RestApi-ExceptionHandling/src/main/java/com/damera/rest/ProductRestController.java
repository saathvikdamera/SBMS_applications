package com.damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.damera.request.Product;
import com.damera.service.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) {
		return service.getProductById(id);
	}

}
