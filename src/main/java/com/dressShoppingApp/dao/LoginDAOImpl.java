package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.dressShoppingApp.model.Login;


public class LoginDAOImpl implements ILoginDAO {
		
		//private static Object user;
		public static void addLogin (Login login)throws Exception  {
			//// Step 1 : Database Driver ( Optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2: Get the Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
					"rev_user", "rev_user");
			
		String query="INSERT INTO Dress_Shopping_App_User_Login (User_Email_ID,User_Password) VALUES(?,?)";
		PreparedStatement statement=connection.prepareStatement(query);//purpose-if we use concatenation method in statement space occupied more so use prepared statement and get the values.
			statement.setString(1,login.getUser_Email_ID());
			statement.setString(2,login.getUser_Password());
			
			
			System.out.println(query);
			int row=statement.executeUpdate();
			System.out.println("No of rows inserted:"+row);
			
			statement.close();
		connection.close();
		}
	}
	
