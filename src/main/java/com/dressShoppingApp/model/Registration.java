package com.dressShoppingApp.model;

public class Registration {
 
	
	private String User_Name;
	private String User_Email_ID;
	private String User_Password;
	private String User_Mobile_No;

public String getUser_Name() {
	return User_Name;
}

public void setUser_Name(String user_Name) {
	User_Name = user_Name;
}

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
public String getUser_Mobile_No() {
	return User_Mobile_No;
}

public void setUser_Mobile_No(String user_Mobile_No) {
	User_Mobile_No = user_Mobile_No;
}


public String toString() {
	return " User_Name=" + User_Name + ", User_Email_ID=" + User_Email_ID + ", User_Password=" + User_Password + ", User_Mobile_No=" + User_Mobile_No + "";
}


}
