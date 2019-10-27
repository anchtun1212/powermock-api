package com.powermock.dto;

public class UserResponse {
	
	private UserRequest userRequest;
	
	private String message;
	
	private int statusCode;
	
	public UserResponse(UserRequest userRequest, String message, int statusCode) {
		this.userRequest = userRequest;
		this.message = message;
		this.statusCode = statusCode;
	}

	public UserRequest getUserRequest() {
		return userRequest;
	}

	public void setUserRequest(UserRequest userRequest) {
		this.userRequest = userRequest;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
