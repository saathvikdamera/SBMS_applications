package com.damera.service.Impl;

import org.springframework.stereotype.Service;

import com.damera.exceptions.NoProductFoundException;
import com.damera.request.Product;
import com.damera.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product getProductById(Integer pId) {
		
		if(pId == 101) {
			return new Product(pId, "Laptop", 65000.0);
		}else {
			throw new NoProductFoundException("No Product Found");
		}
		
	}

}
