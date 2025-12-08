package com.Pritam44.DemoRestApi.Controller;


public class HellowWorld {
	String message;

	public HellowWorld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HellowWorld [message=" + message + "]";
	}
	

}
