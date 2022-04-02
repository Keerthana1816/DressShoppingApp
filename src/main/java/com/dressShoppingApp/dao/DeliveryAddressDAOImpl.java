package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.DeliveryAddress;

public class DeliveryAddressDAOImpl implements IDeliveryAddressDAO {

	public void details(DeliveryAddress address) throws Exception {

		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO Delivery_Address(OrderIdNo,Name,MobileNo,DoorNo,Address,Location,District,State) VALUES (?,?,?,?,?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement = connection.prepareStatement(query);

		statement.setString(1, address.getOrderIdNo());
		statement.setString(2, address.getName());
		statement.setString(3, address.getMoblieNo());
		statement.setString(4, address.getDoorNo());
		statement.setString(5, address.getAddress());
		statement.setString(6, address.getLocation());
		statement.setString(7, address.getDistrict());
		statement.setString(8, address.getState());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();
	}
}