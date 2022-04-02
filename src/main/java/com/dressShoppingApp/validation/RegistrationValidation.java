package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Registration;

public class RegistrationValidation {

	public static void validation(Registration registration) throws Exception {
		if (registration.getUserName() != null) {
			System.out.println("valid UserName");

		} else {
			throw new Exception("Invalid UserName");
		}

		if (registration.getUserEmail().contains("@") && registration.getUserEmail().contains(".com")) {
			System.out.println("valid UserEmail");

		} else {
			throw new Exception("Invalid UserEmail");
		}
		if (registration.getUserPassword().length() >= 8 && registration.getUserPassword().length() <= 16) {
			System.out.println("valid UserPassword");

		} else {
			throw new Exception("Invalid UserPassword");
		}
		if (registration.getUserMobileNo().length() >= 10) {
			System.out.println("valid MobileNo");

		} else {
			throw new Exception("Invalid MobileNO");
		}

	}
}
