package com.tejamanne.restapi.util;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
	
	HttpStatus status;
	
	String message;
}
