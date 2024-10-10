package com.sainath.codewitharjun.exception;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(Long id) {
		super("Could not find the user with id "+id);
	}
}
