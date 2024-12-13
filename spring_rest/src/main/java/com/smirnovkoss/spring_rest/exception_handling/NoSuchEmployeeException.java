package com.smirnovkoss.spring_rest.exception_handling;

public class NoSuchEmployeeException extends RuntimeException {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	
	public NoSuchEmployeeException(String message) {
        super(message);
    }
}