package com.tejamanne.restapi.service;

import java.util.List;

import com.tejamanne.restapi.dto.UserDTO;
import com.tejamanne.restapi.exception.EntityNotFoundException;

public interface UserService {

	List<UserDTO> getAllUsers() throws EntityNotFoundException;
}
