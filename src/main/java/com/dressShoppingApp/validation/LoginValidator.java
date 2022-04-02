package com.dressShoppingApp.validation;

import java.util.Scanner;

import com.dressShoppingApp.dao.LoginDAOImpl;

public class LoginValidator {
	public static void test() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email ID:");
		String email = sc.next();
		System.out.println("Enter your Password:");
		String password = sc.next();

		try {
			LoginDAOImpl loginDAOImpl = new LoginDAOImpl();
			loginDAOImpl.loginValidator(email, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
