package com.powermock.util;

import org.springframework.util.StringUtils;

public class NotificationUtil {

	public static String sendEmail(String email) {
		String result = "success";
		if (StringUtils.isEmpty(email)) {
			result = "failure";
		}
		return result;
	}

}
