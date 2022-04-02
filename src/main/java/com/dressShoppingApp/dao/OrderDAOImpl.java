package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.Order;

public class OrderDAOImpl implements IOrderDAO {

	public void addOrders(Order Orders) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO Dress_Shopping_App_Orders (DressIdNo,Size,Price,Quantity,TotalPrice) VALUES(?,?,?,?,?)";

		statement = connection.prepareStatement(query);

		statement.setString(1, Orders.getDressIdNo());
		statement.setString(2, Orders.getSize());
		statement.setString(3, Orders.getPrice());
		statement.setString(4, Orders.getQuantity());
		statement.setString(5, Orders.getTotalPrice());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();
	}

	public static void updateOrders(Order Orders) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "UPDATE Dress_Shopping_App_Orders SET Size=? WHERE DressIdNo=?";

		statement = connection.prepareStatement(query);

		statement.setString(1, Orders.getSize());
		statement.setString(2, Orders.getDressIdNo());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();
	}
}
