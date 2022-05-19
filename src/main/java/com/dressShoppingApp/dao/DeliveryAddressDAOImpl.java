package com.dressshoppingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dressshoppingapp.model.DeliveryAddress;

public class DeliveryAddressDAOImpl implements IDeliveryAddressDAO {

	public void details(DeliveryAddress address) throws Exception {

		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO delivery_address(order_id,name,mobile_no,door_no,address,location,district,state) VALUES (?,?,?,?,?,?,?,?)";
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