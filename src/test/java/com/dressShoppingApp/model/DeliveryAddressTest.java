package com.dressshoppingapp.model;

import com.dressshoppingapp.dao.DeliveryAddressDAOImpl;
import com.dressshoppingapp.model.DeliveryAddressTest;

import java.util.Scanner;

public class DeliveryAddressTest {

	public static void main(String[] args) throws Exception {
		address();
	}

	public static void address() throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter OrderIdNo:");
		String OrderIdNo = sc.next();
		System.out.println("Enter Name:");
		String Name = sc.next();
		System.out.println("Enter Mobile No:");
		String MobileNo = sc.next();
		System.out.println("Enter Door No:");
		String DoorNo = sc.next();
		System.out.println("Enter Address:");
		String Address = sc.next();
		System.out.println("Enter Location:");
		String Location = sc.next();
		System.out.println("Enter District:");
		String District = sc.next();
		System.out.println("Enter State:");
		String State = sc.next();

		DeliveryAddress address = new DeliveryAddress();

		address.setOrderIdNo(OrderIdNo);
		address.setName(Name);
		address.setMoblieNo(MobileNo);
		address.setDoorNo(DoorNo);
		address.setAddress(Address);
		address.setLocation(Location);
		address.setDistrict(District);
		address.setState(State);

		System.out.println("Your Order will dispatch soon..\n");
		System.out.println("Thank You for Shopping \n");
		DeliveryAddressDAOImpl deliveryAddressDAOImpl = new DeliveryAddressDAOImpl();
		deliveryAddressDAOImpl.details(address);
	}
}
