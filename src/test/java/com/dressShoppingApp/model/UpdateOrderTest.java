package com.dressShoppingApp.model;

import java.util.Scanner;

import com.dressShoppingApp.dao.OrderDAOImpl;


public class UpdateOrderTest {
	public static void main(String[] args) throws Exception {
		update();
	}

	public static  void update() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		String Size = sc.next();
		System.out.println("Enter Dress Id No:");
		String DressIdNo = sc.next();

		Order o = new Order();
		o.setSize(Size);
		o.setDressIdNo(DressIdNo);

		try {
			OrderDAOImpl.updateOrders(o);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("Your Order is Updated successfully..\n");

		}
	}
}
