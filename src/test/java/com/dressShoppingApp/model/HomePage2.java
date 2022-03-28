package com.dressShoppingApp.model;

import java.util.Scanner;

import com.dressShoppingApp.validation.LoginValidator;

public class HomePage2 {
	public static void main(String[] args) throws Exception {
		home2();
	}
  public static void home2() throws Exception {
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("4.Login to order the Dress");
	  System.out.println("5.Back to Homepage");
	  int Press=sc.nextInt();
	  
	  if(Press==4) {
		  LoginValidator.test();
		  System.out.println("\n\n");
		  System.out.println("Order Process...\n");
		  HomePage3.home3();
	  }
	  else if(Press==5) {
		  HomePage1.home1();  
	  }
  }
}
