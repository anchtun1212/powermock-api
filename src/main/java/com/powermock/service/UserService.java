package com.powermock.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.powermock.dto.UserRequest;
import com.powermock.dto.UserResponse;
import com.powermock.util.NotificationUtil;

@Service
public class UserService {
	
	public UserResponse addUser(UserRequest user) {
		String message = NotificationUtil.sendEmail(user.getEmail());
		return new UserResponse(user, message, HttpStatus.OK.value());
	}
	
}
