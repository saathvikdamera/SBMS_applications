package com.damera.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damera.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

}
