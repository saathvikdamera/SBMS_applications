package com.damera.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.damera.entity.UserDtls;
import com.damera.request.UserDTO;

@Mapper
public interface UserEntityDTOMapper {
	
	UserEntityDTOMapper INSTANCE = Mappers.getMapper(UserEntityDTOMapper.class);
	
	@Mapping(target = "name",source = "user.userName")
	@Mapping(target = "mobile",source = "user.phno")
	UserDTO userEntityToDto(UserDtls user);
	
	@Mapping(target = "userName",source = "dto.name")
	@Mapping(target = "phno",source = "dto.mobile")
	UserDtls userDtoToEntity(UserDTO dto);

}
