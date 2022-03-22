package com.dressShoppingApp.model;

public class Login {

	
	private String User_Email_ID;
	private String User_Password;
	

public String getUser_Email_ID() {
	return User_Email_ID;
}

public void setUser_Email_ID(String user_Email_ID) {
	User_Email_ID = user_Email_ID;
}

public String getUser_Password() {
	return User_Password;
}

public void setUser_Password(String user_Password) {
	User_Password = user_Password;
}


public String toString() {
	return " User_Email_ID=" + User_Email_ID + ", User_Password=" + User_Password + "";
}


}

