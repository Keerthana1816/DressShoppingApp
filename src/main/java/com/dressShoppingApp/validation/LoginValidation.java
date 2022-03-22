package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Login;

public class LoginValidation {

	public static void Loginvalidation(Login login) throws Exception {
		if(login.getUser_Email_ID()==null) {
			throw new Exception("invalid User_Email_ID");
		}
		else if(login.getUser_Password() ==null) {
			throw new Exception("invalid User_Password");
		}
		
		System.out.println("validation is successful");
	}
}

