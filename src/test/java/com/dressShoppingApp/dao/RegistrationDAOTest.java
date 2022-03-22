package com.dressShoppingApp.dao;

import com.dressShoppingApp.model.Registration;
import com.dressShoppingApp.dao.RegistrationDAOTest;

public class RegistrationDAOTest {
	public static void main(String[] args) throws Exception {
		
		Registration user=new Registration();
		user.setUser_Name("partha");
		user.setUser_Email_ID("partha21@gmail.com");
		user.setUser_Password("123");
		user.setUser_Mobile_No("8776654326");
		
		
		System.out.println(user);
		
		RegistrationDAOImpl.addRegistration(user);
	}
}