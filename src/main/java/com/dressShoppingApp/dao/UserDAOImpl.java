
package com.dressshoppingapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressshoppingapp.model.User;

public class UserDAOImpl implements IUserDAO {

	public  void addRegistration(User registration) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO dress_shopping_app_user (name,email,password,mobile_no) VALUES(?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1, registration.getName());
		statement.setString(2, registration.getEmail());
		statement.setString(3, registration.getPassword());
		statement.setString(4, registration.getMobileNo());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();
	}
}
