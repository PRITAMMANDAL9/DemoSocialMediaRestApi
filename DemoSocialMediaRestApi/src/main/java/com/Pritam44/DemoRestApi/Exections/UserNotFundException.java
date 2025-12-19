package com.Pritam44.DemoRestApi.Exections;

public class UserNotFundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFundException ( String message) {
		super(message);
	}


}
