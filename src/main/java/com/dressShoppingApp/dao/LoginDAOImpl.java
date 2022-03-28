package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.dressShoppingApp.model.Registration;
import com.dressShoppingApp.validation.LoginValidator;


public class LoginDAOImpl implements ILoginDAO {
  
	public LoginDAOImpl() {
	}
	public static void main(String[] args) {
		
	}
		public static void loginValidator(String UserEmail ,String password) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2: Get the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
					"rev_user", "rev_user");
			
		
		   PreparedStatement statement;
		   ResultSet rs = null;
		   
		String query = "SELECT UserEmail,UserPassword FROM Dress_Shopping_App_User WHERE UserEmail=?";
		statement = connection.prepareStatement(query);
		        statement.setString(1, UserEmail);
		        rs = statement.executeQuery();
		        String Email=null;
		        String Password=null;
		while(rs.next())
		{
		Email=rs.getString("UserEmail");
		Password=rs.getString("UserPassword");
		}
		if(Email==null)
		{
		       System.out.println("Invalid UserEmail");
		       LoginValidator.test();
		}
		else if(Password.equals(password))
		{
		System.out.println("You have logged in successfully");
		
		}
		else
		{
			System.out.println("Invalid Password");
		     LoginValidator.test();
		}
		}
}	
	
