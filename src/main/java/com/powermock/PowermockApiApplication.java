package com.powermock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.powermock.dto.UserRequest;
import com.powermock.dto.UserResponse;
import com.powermock.service.UserService;

@SpringBootApplication
@RestController
public class PowermockApiApplication {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public UserResponse addUser(@RequestBody UserRequest user) {
		return userService.addUser(user);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(PowermockApiApplication.class, args);
	}

}
