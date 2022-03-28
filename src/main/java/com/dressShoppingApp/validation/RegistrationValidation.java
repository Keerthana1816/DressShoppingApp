package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Registration;

public class RegistrationValidation {

	public static void validation(Registration registration) throws Exception {
		if(registration.getUserName()!=null) {
		
		}
		else
		{
		throw new Exception("Invalid UserName");
		} 
		
		if(registration.getUserEmail().contains("@")&&registration.getUserEmail().contains(".com")) {
			
		}
		else
		{
			throw new Exception("Invalid UserEmail");
		}
		if(registration.getUserPassword().length()>=8&&registration.getUserPassword().length()<=16) {
			
		}
		else
		{
			throw new Exception("Invalid UserPassword");
		}
		 if(registration.getUserMobileNo().length()>=10) {
			
		}
		 else
			{
			 throw new Exception("Invalid MobileNO");
			}
		 
		 }
	}

