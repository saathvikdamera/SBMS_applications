package com.damera.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damera.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
	
	UserDtls findByUserId(Integer userId);

}
