package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.dressShoppingApp.model.Payment;


public class PaymentDAOImpl implements IPaymentDAO  {
	
	public static void details(Payment payment) throws Exception {

		
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
						"rev_user");
			String query = "INSERT INTO payments(OrderIdNo,PaymentOption,Price,DeliveryCharge,TotalAmount) VALUES (?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(query);
			statement = connection.prepareStatement(query);
			
			statement.setString(1,payment.getOrderIdNo());
			statement.setString(2,payment.getPaymentOption());
			statement.setString(3,payment.getPrice());
			statement.setString(4,payment.getDeliveryCharge());
			statement.setString(5,payment.getTotalAmount());

			System.out.println();
			int row=statement.executeUpdate();
			System.out.println();
			
			statement.close();
		connection.close();
		
		}
}



