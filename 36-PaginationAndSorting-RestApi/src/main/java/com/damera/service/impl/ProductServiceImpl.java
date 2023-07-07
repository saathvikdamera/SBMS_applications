package com.damera.service.impl;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.damera.entity.ProductEntity;
import com.damera.repo.ProductRepository;
import com.damera.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;
	
	@PostConstruct
	@Override
	public void saveProducts() {
		  List<ProductEntity> products = IntStream.rangeClosed(1, 200)
                .mapToObj(i -> new ProductEntity("product" + i,new Random().nextLong(500000) , new Random().nextInt(100)))
                .collect(Collectors.toList());
        repository.saveAll(products);
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public List<ProductEntity> getSortedProducts(String field) {
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	@Override
	public Page<ProductEntity> getProductsWithPagination(Integer page, Integer size) {
		//Page<ProductEntity> products = repository.findAll(PageRequest.of(page, size));
		return repository.findAll(PageRequest.of(page, size));
	}
	
	@Override
	public Page<ProductEntity> getProductsWithPaginationAndSorting(Integer page, Integer size, String field) {
		return repository.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.ASC,field)));
	}

}
