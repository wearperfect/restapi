package com.tejamanne.restapi.mapper;

import org.mapstruct.Mapper;

import com.tejamanne.restapi.dto.UserDTO;
import com.tejamanne.restapi.entity.User;

@Mapper
public interface UserMapper {

	public UserDTO mapUserToUserDTO(User user);
	
	public User mapUserDTOToUser(UserDTO userDTO);
}
