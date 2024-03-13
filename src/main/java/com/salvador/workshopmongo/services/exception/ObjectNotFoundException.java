package com.salvador.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}
