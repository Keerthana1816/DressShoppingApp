package com.dressshoppingapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.dressshoppingapp.model.Payment;

public class PaymentDAOImpl implements IPaymentDAO {

	public void details(Payment payment) throws Exception {

		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();

		String query = "INSERT INTO payments(order_id,name,payment_option,price,delivery_charge,total_amount) VALUES (?,?,?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement = connection.prepareStatement(query);

		statement.setString(1, payment.getOrderIdNo());
		statement.setString(2, payment.getName());
		statement.setString(3, payment.getPaymentOption());
		statement.setString(4, payment.getPrice());
		statement.setString(5, payment.getDeliveryCharge());
		statement.setString(6, payment.getTotalAmount());

		System.out.println();
		int row = statement.executeUpdate();
		System.out.println();

		statement.close();
		connection.close();

	}
}
