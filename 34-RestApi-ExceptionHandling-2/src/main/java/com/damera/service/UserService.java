package com.damera.service;

import com.damera.entity.UserDtls;
import com.damera.request.UserDTO;

public interface UserService {

	UserDtls saveUser(UserDTO dto);
	UserDtls getUserById(Integer userID);
	
}
