
package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.Registration;


public class RegistrationDAOImpl implements IRegistrationDAO {
		
		//private static Object user;
		public static void addRegistration(Registration registration)throws Exception  {
			//// Step 1 : Database Driver ( Optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2: Get the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
					"rev_user", "rev_user");
			
		String query="INSERT INTO Dress_Shopping_App_User (User_Name,User_Email_ID,User_Password,User_Mobile_No) VALUES(?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statement and get the values.
			statement.setString(1,registration.getUser_Name());
			statement.setString(2,registration.getUser_Email_ID());
			statement.setString(3,registration.getUser_Password());
			statement.setString(4,registration.getUser_Mobile_No());
			
			System.out.println(query);
			int row=statement.executeUpdate();
			System.out.println("No of rows inserted:"+row);
			
			statement.close();
		connection.close();
		}
	}
	