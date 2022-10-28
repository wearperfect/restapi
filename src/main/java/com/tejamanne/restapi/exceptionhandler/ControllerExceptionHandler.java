package com.tejamanne.restapi.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tejamanne.restapi.exception.EntityNotFoundException;
import com.tejamanne.restapi.util.ErrorResponse;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleNotFoundException(Exception e) {
		return new ErrorResponse(HttpStatus.NOT_FOUND, e.getMessage());
	}
}
