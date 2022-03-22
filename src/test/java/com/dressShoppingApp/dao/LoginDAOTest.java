package com.dressShoppingApp.dao;

import com.dressShoppingApp.model.Login;
import com.dressShoppingApp.dao.LoginDAOTest;

public class LoginDAOTest {
	public static void main(String[] args) throws Exception {
		
		Login user=new Login();
		user.setUser_Email_ID("keerthi16@gmail.com");
		user.setUser_Password("123");
		
		
		
		System.out.println(user);
		
		LoginDAOImpl.addLogin(user);
	}
}

	
