package com.dressShoppingApp.model;

public class Login {

	private String UserEmail;
	private String UserPassword;

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		this.UserEmail = userEmail;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		this.UserPassword = userPassword;
	}

	public String toString() {
		return " UserEmail=" + UserEmail + ", UserPassword=" + UserPassword + "";

	}
}