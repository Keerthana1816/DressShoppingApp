package com.dressshoppingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dressshoppingapp.model.Order;

public class OrderDAOImpl implements IOrderDAO {

	public void addOrders(Order Orders) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO dress_shopping_app_orders (id,size,price,count,total_price) VALUES(?,?,?,?,?)";

		statement = connection.prepareStatement(query);

		statement.setString(1, Orders.getDressIdNo());
		statement.setString(2, Orders.getSize());
		statement.setString(3, Orders.getPrice());
		statement.setString(4, Orders.getCount());
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

		String query = "UPDATE dress_shopping_app_orders SET size=? WHERE id=?";

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
