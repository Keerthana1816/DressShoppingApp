package com.dressshoppingapp.model;

import java.util.Scanner;

import com.dressshoppingapp.validation.LoginValidator;

public class HomePage1 {
	public static void main(String[] args) throws Exception {
		home1();
	}

	public static void home1() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welecome to Trends");
		System.out.println("1.If you are new to app Register");
		System.out.println("2.Login");
		System.out.println("3.Exit");
		int Press = sc.nextInt();
		if (Press == 1) {
			UserTest.test();
			home1();

		}
		if (Press == 2) {
			LoginValidator.test();
			System.out.println("\n\n");
			System.out.println("Order Process...\n");
			HomePage2.home2();
		}

		else if (Press == 3) {

			
		} else if (Press != 1 || Press != 2 || Press != 3) {
			System.out.println("Oops Something went worry...\nRefresh the page :(");
		}
	}
}
