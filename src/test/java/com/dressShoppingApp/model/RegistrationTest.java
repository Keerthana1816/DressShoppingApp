 package com.dressShoppingApp.model;


import com.dressShoppingApp.dao.RegistrationDAOImpl;
import com.dressShoppingApp.model.RegistrationTest;
import com.dressShoppingApp.validation.LoginValidator;
import com.dressShoppingApp.validation.RegistrationValidation;
import java.util.Scanner;


public class RegistrationTest {

	
	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String UserName=sc.next();
		System.out.println("Enter Your Email id:");
		String UserEmail=sc.next();
		System.out.println("Enter Your Password:");
		String UserPassword=sc.next();
		System.out.println("Enter Your MobileNo:");
		String UserMobileNo=sc.next();
		
		Registration user=new Registration();
		user.setUserName(UserName);
		user.setUserEmail(UserEmail);
		user.setUserPassword(UserPassword);
		user.setUserMobileNo(UserMobileNo);
		
		
		
		
		int count=0;
		try
		{
		RegistrationValidation.validation(user);
		
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
			System.out.println("You have entered a wrong values");
			System.out.println("Register Once again");
			count++;
			test();
		}

		if(count==0)
		{
			System.out.println("Your Registration is Successful..");
		    RegistrationDAOImpl.addRegistration(user);
		    
	} 
	}
}