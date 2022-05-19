package com.dressshoppingapp.model;

public class User {

	private String name;
	private String email;
	private String password;
	private String mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String toString() {
		return " name=" + name + ", email=" + email + ", password=" + password
				+ ", mobileNo=" + mobileNo + "";
	}

}
