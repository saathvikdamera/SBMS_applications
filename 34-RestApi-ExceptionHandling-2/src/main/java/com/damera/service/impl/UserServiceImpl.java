package com.damera.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damera.entity.UserDtls;
import com.damera.exception.NoUserFoundException;
import com.damera.repo.UserRepository;
import com.damera.request.UserDTO;
import com.damera.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public UserDtls saveUser(UserDTO dto) {
        UserDtls user = new UserDtls();
        BeanUtils.copyProperties(dto, user);
        UserDtls savedUser = repo.save(user);
		return savedUser;
	}

	@Override
	public UserDtls getUserById(Integer userID) {
		UserDtls user = repo.findByUserId(userID);
		if(user != null)
		   return user;
		else
			throw new NoUserFoundException("User not found");
	}

	
	
}
