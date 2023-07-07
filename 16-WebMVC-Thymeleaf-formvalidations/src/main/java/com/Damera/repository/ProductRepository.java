package com.Damera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Damera.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
