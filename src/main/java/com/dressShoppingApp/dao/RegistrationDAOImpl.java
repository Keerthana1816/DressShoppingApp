
package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.Registration;

public class RegistrationDAOImpl implements IRegistrationDAO {

	public  void addRegistration(Registration registration) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO Dress_Shopping_App_User (UserName,UserEmail,UserPassword,UserMobileNo) VALUES(?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1, registration.getUserName());
		statement.setString(2, registration.getUserEmail());
		statement.setString(3, registration.getUserPassword());
		statement.setString(4, registration.getUserMobileNo());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();
	}
}
