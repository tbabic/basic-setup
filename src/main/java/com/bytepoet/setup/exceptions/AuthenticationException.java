package com.bytepoet.setup.exceptions;

public class AuthenticationException extends RuntimeException {

	private static final long serialVersionUID = 1502417190017511741L;

	public AuthenticationException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public AuthenticationException(String message) {
		super(message);
	}

	
}
