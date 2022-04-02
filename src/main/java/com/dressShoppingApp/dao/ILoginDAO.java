package com.dressShoppingApp.dao;

public interface ILoginDAO {
	public void loginValidator(String UserEmail, String password) throws Exception;
}
