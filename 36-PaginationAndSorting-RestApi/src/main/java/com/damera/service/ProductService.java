package com.damera.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.damera.entity.ProductEntity;

public interface ProductService {
	
	void saveProducts();

	List<ProductEntity> getAllProducts();
	
	List<ProductEntity> getSortedProducts(String field);
	
	Page<ProductEntity> getProductsWithPagination(Integer page,Integer size);
	
	Page<ProductEntity> getProductsWithPaginationAndSorting(Integer page,Integer size,String field);

}
