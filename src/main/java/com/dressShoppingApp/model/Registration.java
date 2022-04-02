package com.dressShoppingApp.model;

public class Registration {

	private String UserName;
	private String UserEmail;
	private String UserPassword;
	private String UserMobileNo;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String UserEmail) {
		this.UserEmail = UserEmail;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String UserPassword) {
		this.UserPassword = UserPassword;
	}

	public String getUserMobileNo() {
		return UserMobileNo;
	}

	public void setUserMobileNo(String UserMobileNo) {
		this.UserMobileNo = UserMobileNo;
	}

	public String toString() {
		return " UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserPassword=" + UserPassword
				+ ", UserMobileNo=" + UserMobileNo + "";
	}

}
