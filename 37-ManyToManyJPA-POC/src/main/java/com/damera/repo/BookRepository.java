package com.damera.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damera.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

	BookEntity findByBookId(Integer bookId);
}
