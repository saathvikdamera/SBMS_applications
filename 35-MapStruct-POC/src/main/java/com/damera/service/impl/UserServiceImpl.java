package com.damera.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damera.entity.UserDtls;
import com.damera.mapper.UserEntityDTOMapper;
import com.damera.repo.UserRepository;
import com.damera.request.UserDTO;
import com.damera.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	
	private UserEntityDTOMapper instance = UserEntityDTOMapper.INSTANCE;

	@Override
	public UserDtls saveUser(UserDTO dto) {
		UserDtls entity = instance.userDtoToEntity(dto);
		UserDtls userDtls = repo.save(entity);
		return userDtls;
	}
	
	@Override
	public UserDTO getUserById(Integer id) {
		UserDtls user = repo.findByUserId(id);
		UserDTO dto = instance.userEntityToDto(user);
		return dto;
	}

}
