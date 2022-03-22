package com.dressShoppingApp.model;

import com.dressShoppingApp.dao.RegistrationDAOImpl;
import com.dressShoppingApp.model.RegistrationTest;

public class RegistrationTest {

	public static void main(String[] args) throws Exception {
		
		Registration user=new Registration();
		user.setUser_Name("sanju");
		user.setUser_Email_ID("sanjui8@gmail.com");
		user.setUser_Password("123");
		user.setUser_Mobile_No("9876654326");
		
		
		System.out.println(user);
		
	
		RegistrationDAOImpl.addRegistration(user);
}
}