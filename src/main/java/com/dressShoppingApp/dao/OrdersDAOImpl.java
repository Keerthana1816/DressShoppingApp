package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.Orders;


public class OrdersDAOImpl implements IOrdersDAO {
	
	//private static Object user;
	public static void addOrders(Orders Orders)throws Exception  {
		//// Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		
	String query="INSERT INTO Dress_Shopping_App_Orders (Customer_Name,Mobile_No,Dress_Name,Brand_Name,Colour,Size,Price,Count,Total_Price) VALUES(?,?,?,?,?,?,?,?,?)";
	
	PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statement and get the values.
	    statement.setString(1,Orders.getCustomer_Name());
	    statement.setString(2,Orders.getMobile_No()); 
	    statement.setString(3,Orders.getDress_Name());
		statement.setString(4,Orders.getBrand_Name());
		statement.setString(5,Orders.getColour());
		statement.setString(6,Orders.getSize());
		statement.setString(7,Orders.getPrice());
		statement.setString(8,Orders.getCount());
		statement.setString(9,Orders.getTotal_Price());
		
		
		System.out.println(query);
		int row=statement.executeUpdate();
		System.out.println("No of rows inserted:"+row);
		
		statement.close();
	connection.close();
	}
}
	