package com.damera.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damera.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
