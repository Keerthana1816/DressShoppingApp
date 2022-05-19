package com.dressshoppingapp.model;

import java.util.Scanner;

import com.dressshoppingapp.dao.OrderDAOImpl;
import com.dressshoppingapp.model.OrderTest;

public class OrderTest {

	public static void main(String[] args) throws Exception {
		order();
	}

	public static void order() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Dress Id No:");
		String id = sc.next();
		System.out.println("Enter Size:");
		String size = sc.next();
		System.out.println("Enter Price:");
		String price = sc.next();
		System.out.println("Enter Count:");
		String count = sc.next();
		System.out.println("Enter Total Price:");
		String totalPrice = sc.next();

		Order o = new Order();

		o.setDressIdNo(id);
		o.setSize(size);
		o.setPrice(price);
		o.setCount(count);
		o.setTotalPrice(totalPrice);

		int count1 = 0;
		try {

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("You have entered a wrong Option");
			System.out.println("Enter Once again");
			count1++;
			order();
		}

		if (count1 == 0) {
			System.out.println("Your Order is placed successfully..\n");
			OrderDAOImpl orderDAOImpl = new OrderDAOImpl();
			orderDAOImpl.addOrders(o);
			System.out.println("Update Size");
			UpdateOrderTest.update();

		}
	}

}
