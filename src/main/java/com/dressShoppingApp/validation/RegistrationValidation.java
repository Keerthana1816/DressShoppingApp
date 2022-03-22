package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Registration;

public class RegistrationValidation {

	public static void Registrationvalidation(Registration registration) throws Exception {
		if(registration.getUser_Name()==null|| registration.getUser_Name().equals(" ")||registration.getUser_Name().trim().equals("")) {
			throw new Exception("User_Name cannot be null");//raise an problem
		}
		else if(registration.getUser_Email_ID()==null) {
			throw new Exception("invalid User_Email_ID");
		}
		else if(registration.getUser_Password() ==null) {
			throw new Exception("invalid User_Password");
		}
		else if(registration.getUser_Mobile_No() ==null) {
			throw new Exception("invalid mobile number");
		}
		System.out.println("validation is successful");
	}
}
