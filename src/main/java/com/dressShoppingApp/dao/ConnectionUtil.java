package com.dressshoppingapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection databaseConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://database-001.c6p37bdo1wjc.ap-south-1.rds.amazonaws.com:3306/keerthana_db",
				"keerthana", "keerthana18");
		return connection;
	}

}
