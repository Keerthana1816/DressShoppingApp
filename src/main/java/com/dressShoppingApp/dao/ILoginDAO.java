package com.dressshoppingapp.dao;

public interface ILoginDAO {
	public void loginValidator(String email, String password) throws Exception;
}
