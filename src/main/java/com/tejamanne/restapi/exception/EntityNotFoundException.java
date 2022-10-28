package com.tejamanne.restapi.exception;

public class EntityNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(String statusText) {
		super(statusText);
	}

}
