package com.Damera.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Damera.entity.ContactsEntity;

public interface ContactsRepository extends JpaRepository<ContactsEntity, Integer> {

}
