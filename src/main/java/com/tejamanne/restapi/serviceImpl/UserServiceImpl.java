package com.tejamanne.restapi.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejamanne.restapi.dto.UserDTO;
import com.tejamanne.restapi.entity.User;
import com.tejamanne.restapi.exception.EntityNotFoundException;
import com.tejamanne.restapi.mapper.UserMapper;
import com.tejamanne.restapi.repository.UserRepository;
import com.tejamanne.restapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserDTO> getAllUsers() throws EntityNotFoundException {
		List<User> userList = userRepository.findAll();
		List<UserDTO> userDTOList = userList.stream().map(user -> userMapper.mapUserToUserDTO(user))
				.collect(Collectors.toList());
		throw new EntityNotFoundException("Users not found");
		//return userDTOList;
	}

}
