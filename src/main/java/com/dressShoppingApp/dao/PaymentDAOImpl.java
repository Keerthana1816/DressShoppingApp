package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.dressShoppingApp.model.Payment;

public class PaymentDAOImpl implements IPaymentDAO {

	public void details(Payment payment) throws Exception {

		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO payments(OrderIdNo,PaymentOption,Price,DeliveryCharge,TotalAmount) VALUES (?,?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement = connection.prepareStatement(query);

		statement.setString(1, payment.getOrderIdNo());
		statement.setString(2, payment.getPaymentOption());
		statement.setString(3, payment.getPrice());
		statement.setString(4, payment.getDeliveryCharge());
		statement.setString(5, payment.getTotalAmount());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();

	}
}
