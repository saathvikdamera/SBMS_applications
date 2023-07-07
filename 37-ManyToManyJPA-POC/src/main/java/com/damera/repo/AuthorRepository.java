package com.damera.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damera.entity.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

	AuthorEntity findByAuthorId(Integer authorId);
}
