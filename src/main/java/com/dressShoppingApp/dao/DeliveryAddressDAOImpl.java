package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.DeliveryAddress;


public class DeliveryAddressDAOImpl implements IDeliveryAddressDAO  {
	
	public static void details(DeliveryAddress address) throws Exception {

		
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
						"rev_user");
			String query = "INSERT INTO Delivery_Address(Name,MobileNo,DoorNo,Address,Location,District,State) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(query);
			statement = connection.prepareStatement(query);
			
			statement.setString(1,address.getName());
			statement.setString(2,address.getMoblieNo());
			statement.setString(3,address.getDoorNo());
			statement.setString(4,address.getAddress());
			statement.setString(5,address.getLocation());
			statement.setString(6,address.getDistrict());
			statement.setString(7,address.getState());

			
			System.out.println();
			int row=statement.executeUpdate();
			System.out.println();
			
			statement.close();
		connection.close();
	}
}