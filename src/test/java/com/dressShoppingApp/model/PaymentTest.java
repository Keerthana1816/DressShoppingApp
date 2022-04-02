package com.dressShoppingApp.model;

import com.dressShoppingApp.dao.OrderDAOImpl;
import com.dressShoppingApp.dao.PaymentDAOImpl;
import com.dressShoppingApp.model.PaymentTest;

import java.util.Scanner;

public class PaymentTest {

	public static void main(String[] args) throws Exception {
		payment();
	}

	public static void payment() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Order Id No:");
		String OrderIdNo = sc.next();
		System.out.println("Enter PaymentOption:");
		String PaymentOption = sc.next();
		System.out.println("Enter Price:");
		String Price = sc.next();
		System.out.println("Enter DeliveryCharge:");
		String DeliveryCharge = sc.next();
		System.out.println("Enter TotalAmount:");
		String TotalAmount = sc.next();

		Payment payment = new Payment();

		payment.setOrderIdNo(OrderIdNo);
		payment.setPaymentOption(PaymentOption);
		payment.setPrice(Price);
		payment.setDeliveryCharge(DeliveryCharge);
		payment.setTotalAmount(TotalAmount);

		int count = 0;
		try {

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("You have entered a wrong Option");
			System.out.println("Enter Once again");
			count++;
			payment();
		}

		if (count == 0) {
			System.out.println("Your Payment is done successfully..\n");
			PaymentDAOImpl paymentDAOImpl = new PaymentDAOImpl();
			paymentDAOImpl.details(payment);

		}
	}
}
