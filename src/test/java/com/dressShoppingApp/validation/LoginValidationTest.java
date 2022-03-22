package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Login;
import com.dressShoppingApp.validation.LoginValidationTest;

public class LoginValidationTest {
	public static void main(String[] args) throws Exception {
		Login user=new Login();
		user.setUser_Email_ID("keerthi17@gmail.com");
		user.setUser_Password("123");

    System.out.println(user);
    LoginValidation.Loginvalidation(user);
}
}