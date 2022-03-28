package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.Order;


public class OrderDAOImpl implements IOrderDAO {
	

	public static void addOrders(Order Orders)throws Exception  {
		// Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		
	String query="INSERT INTO Dress_Shopping_App_Orders (DressIdNo,Size,Price,Quantity,TotalPrice) VALUES(?,?,?,?,?)";
	
	PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statement and get the values.
	    
	    statement.setString(1,Orders.getDressIdNo());
		statement.setString(2,Orders.getSize());
		statement.setString(3,Orders.getPrice());
		statement.setString(4,Orders.getQuantity());
		statement.setString(5,Orders.getTotalPrice());
		
		
		System.out.println();
		int row=statement.executeUpdate();
		System.out.println();
		
		statement.close();
	connection.close();
	}
	
	public static void updateOrders(Order Orders)throws Exception  {
		// Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		
	String query="UPDATE Dress_Shopping_App_Orders SET Size=? WHERE DressIdNo=?";
	
	PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statement and get the values.
	    
	    statement.setString(1,Orders.getSize());
		statement.setString(2,Orders.getDressIdNo());
		
		
		
		System.out.println();
		int row=statement.executeUpdate();
		System.out.println();
		
		statement.close();
	connection.close();
	}
}
	