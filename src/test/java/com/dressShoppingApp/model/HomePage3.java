package com.dressShoppingApp.model;

import java.util.Scanner;

public class HomePage3 {
	public static void main(String[] args) throws Exception {
		home3();
	}
  public static void home3() throws Exception {
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("6.Place the Order");
	  System.out.println("7.Payment Process");
	  System.out.println("8.Delivery Address Details");
	  System.out.println("9.Back to HomePage");
	  int Press=sc.nextInt();
	  if(Press==6) {
		  OrderTest.order();
		  System.out.println("Payment Option..\n");
		  home3();
	  }
	  else if(Press==7) {
	  PaymentTest.payment();
	  System.out.println("Delivery Address details..\n"); 
	  home3();
	  }
	  else if(Press==8) {
		  DeliveryAddressTest.address();
		  HomePage1.home1();
	  }
	  else if(Press==8) {
		  HomePage1.home1();  
	  }
  }
  }
			 

