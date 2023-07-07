package com.Damera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Damera.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
