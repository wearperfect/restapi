package com.tejamanne.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tejamanne.restapi.dto.UserDTO;
import com.tejamanne.restapi.exception.EntityNotFoundException;
import com.tejamanne.restapi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;


	@RequestMapping("/test")
	public ResponseEntity<List<UserDTO>> getAllUsers() throws EntityNotFoundException{
		return ResponseEntity.ok(userService.getAllUsers());
	}
}
