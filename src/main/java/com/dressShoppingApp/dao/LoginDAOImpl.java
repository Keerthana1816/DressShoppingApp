package com.dressshoppingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dressshoppingapp.validation.LoginValidator;

public class LoginDAOImpl implements ILoginDAO {

	public void loginValidator(String email, String password) throws Exception {
		Connection connection;
		PreparedStatement statement;
		ResultSet rs = null;
		connection = ConnectionUtil.databaseConnection();

		String query = "SELECT email,password FROM dress_shopping_app_user WHERE email=?";
		statement = connection.prepareStatement(query);
		statement.setString(1, email);
		
		rs = statement.executeQuery();
		String Email = null;
		String Password = null;
		while (rs.next()) {
			Email = rs.getString("email");
			Password = rs.getString("password");
		}
		if (Email == null) {
			System.out.println("Invalid UserEmail");
			LoginValidator.test();
		} else if (Password.equals(password)) {
			System.out.println("You have logged in successfully");

		} else {
			System.out.println("Invalid Password");
			LoginValidator.test();
		}
	}
}
