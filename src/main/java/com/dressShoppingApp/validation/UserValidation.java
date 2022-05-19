package com.dressshoppingapp.validation;

import com.dressshoppingapp.model.User;

public class UserValidation {

	public static void validation(User registration) throws Exception {
		if (registration.getName() != null) {
			System.out.println("valid UserName");

		} else {
			throw new Exception("Invalid UserName");
		}

		if (registration.getEmail().contains("@") && registration.getEmail().contains(".com")) {
			System.out.println("valid UserEmail");

		} else {
			throw new Exception("Invalid UserEmail");
		}
		if (registration.getPassword().length() >= 8 && registration.getPassword().length() <= 16) {
			System.out.println("valid UserPassword");

		} else {
			throw new Exception("Invalid UserPassword");
		}
		if (registration.getMobileNo().length() >= 10) {
			System.out.println("valid MobileNo");

		} else {
			throw new Exception("Invalid MobileNO");
		}

	}
}
