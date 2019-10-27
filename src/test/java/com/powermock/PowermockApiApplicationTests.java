package com.powermock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.powermock.dto.UserRequest;
import com.powermock.dto.UserResponse;
import com.powermock.service.UserService;
import com.powermock.util.NotificationUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.powermock.*")
public class PowermockApiApplicationTests {

	@InjectMocks
	private UserService userService;

	@Before // before execute our test execute this method
	public void init() {
		MockitoAnnotations.initMocks(NotificationUtil.class);
	}

	@Test
	public void testMethod() {
		// Given: what exactly input url expecting to run your test case
		String email = "med.aymen.charrada@gmail.com";
		PowerMockito.mockStatic(NotificationUtil.class);

		// When: the method witch you are executing
		when(NotificationUtil.sendEmail(email)).thenReturn("success");

		// Then: result you are expecting
		UserRequest userRequest = new UserRequest("Mohamed Aymen", "Charrada", "med.aymen.charrada@gmail.com", "aymen",	"aymen");

		UserResponse userResponse = userService.addUser(userRequest);

		assertEquals("success", userResponse.getMessage());

	}

}
