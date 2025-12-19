package com.Pritam44.DemoRestApi.Exections;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime timeStand;
	private String message;
	private String details;
	public ErrorDetails(LocalDateTime timeStand, String message, String details) {
		super();
		this.timeStand = timeStand;
		this.message = message;
		this.details = details;
	}
	public LocalDateTime getTimeStand() {
		return timeStand;
	}
	public String getMessage() {
		return message;
	}
	public String getDescription() {
		return details;
	}
	

}
