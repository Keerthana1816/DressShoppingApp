package com.dressShoppingApp.model;

import com.dressShoppingApp.dao.LoginDAOImpl;
import com.dressShoppingApp.model.LoginTest;


	public class LoginTest {

		public static void main(String[] args) throws Exception {
			
			Login user= new Login();
			user.setUser_Email_ID("keerthi18@gmail.com");
			user.setUser_Password("123");
			
			
			System.out.println(user);
			
		
			LoginDAOImpl.addLogin(user);
	}
	}
