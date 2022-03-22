package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Registration;
import com.dressShoppingApp.validation.RegistrationValidationTest;


public class RegistrationValidationTest {
	public static void main(String[] args) throws Exception {
		Registration user=new Registration();
		user.setUser_Name("keerthi");
		user.setUser_Email_ID("keerthi17@gmail.com");
		user.setUser_Password("123");
		user.setUser_Mobile_No("9876654326");
    System.out.println(user);
    RegistrationValidation.Registrationvalidation(user);
	}
}