package com.dressshoppingapp.model;

import com.dressshoppingapp.dao.UserDAOImpl;
import com.dressshoppingapp.model.UserTest;
import com.dressshoppingapp.validation.LoginValidator;
import com.dressshoppingapp.validation.UserValidation;
import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static  void test() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Enter Your Email id:");
		String email = sc.next();
		System.out.println("Enter Your Password:");
		String password = sc.next();
		System.out.println("Enter Your MobileNo:");
		String mobileNo = sc.next();

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobileNo(mobileNo);

		int count = 0;
		try {
			UserValidation.validation(user);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("You have entered a wrong values");
			System.out.println("Register Once again");
			count++;
			test();
		}

		if (count == 0) {
			System.out.println("Your Registration is Successful..");
			UserDAOImpl userDAOImpl = new UserDAOImpl();
			userDAOImpl.addRegistration(user);

		}
	}
}