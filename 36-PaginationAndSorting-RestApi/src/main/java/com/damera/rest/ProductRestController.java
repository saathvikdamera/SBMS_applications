package com.damera.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damera.dto.ApiResponse;
import com.damera.entity.ProductEntity;
import com.damera.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private ProductService service;

	@GetMapping("/")
	public ApiResponse<List<ProductEntity>> getProducts() {
		List<ProductEntity> products = service.getAllProducts();
		return new ApiResponse<List<ProductEntity>>(products.size(), products);
	}

	@GetMapping("/{field}")
	public ApiResponse<List<ProductEntity>> getSortedProducts(@PathVariable String field) {
		List<ProductEntity> products = service.getSortedProducts(field);
		return new ApiResponse<List<ProductEntity>>(products.size(), products);
	}

	@GetMapping("/{page}/{size}")
	public ApiResponse<Page<ProductEntity>> getProductsWithPagination(@PathVariable Integer page,
			@PathVariable Integer size) {
		Page<ProductEntity> products = service.getProductsWithPagination(page, size);
		return new ApiResponse<>(products.getSize(), products);
	}

	@GetMapping("/{page}/{size}/{field}")
	public ApiResponse<Page<ProductEntity>> getSortedProductsWithPagination(@PathVariable Integer page,
			@PathVariable Integer size,@PathVariable String field) {
		Page<ProductEntity> products = service.getProductsWithPaginationAndSorting(page, size, field);
		return new ApiResponse<>(products.getSize(), products);
	}

}
