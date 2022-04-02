package com.dressShoppingApp.model;

import java.util.Scanner;

public class HomePage2 {
	public static void main(String[] args) throws Exception {
		home2();
	}

	public static void home2() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("4.View Dress");
		System.out.println("5.Place the Order");
		System.out.println("6.Payment Process");
		System.out.println("7.Delivery Address Details");
		System.out.println("8.Exit");
		int Press = sc.nextInt();

		if (Press == 4) {
			ViewDressitemsTest.view();
			ViewDressitemsTest.items();
			ViewDressitemsTest.items1();
			System.out.println("\n\n");
			home2();
		}

		else if (Press == 5) {
			OrderTest.order();
			System.out.println("Your Order is updated successfully..\n");
			System.out.println("Payment Option..\n");
			home2();
		} else if (Press == 6) {
			PaymentTest.payment();
			System.out.println("Delivery Address details..\n");
			home2();
		} else if (Press == 7) {
			DeliveryAddressTest.address();
			HomePage1.home1();
		} else if (Press == 8) {
			System.out.println("Thank you");
		}
	}
}
