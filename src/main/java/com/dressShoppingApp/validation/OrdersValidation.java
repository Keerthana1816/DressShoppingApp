package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Orders;

public class OrdersValidation {



		public static void Ordersvalidation(Orders orders) throws Exception {

			if (orders.getCustomer_Name() == null) {
				throw new Exception(" Name is invalid");
			}
			else if (orders.getMobile_No() == null) {
				throw new Exception("MobileNo is invalid");
			}
			
			else if (orders.getDress_Name() == null) {
				throw new Exception("Dress_Name is invalid");
			}
		    else if (orders.getBrand_Name() == null) {
				throw new Exception("Brand_Name is invalid");
			} 
		    else if (orders.getColour() == null) {
				throw new Exception("Colour is invalid");
			} 
		    else if (orders.getSize() == null) {
				throw new Exception("Size is invalid");
			} 
		    else if (orders.getPrice() == null) {
				throw new Exception("Price is invalid");
			} 
		    else if (orders.getCount() == null) {
				throw new Exception("Count is invalid");
			} 
		    else if (orders.getTotal_Price() == null) {
				throw new Exception("amount is not valid");
			} 
			System.out.println("Validation Succesfull");
		}
	}
