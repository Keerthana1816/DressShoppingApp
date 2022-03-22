package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Orders;
import com.dressShoppingApp.validation.OrdersValidationTest;
	
	public class OrdersValidationTest {

		public static void main(String[] args) throws Exception {
			
	
	Orders orders=new Orders();
	orders.setCustomer_Name("keerthana");
	orders.setMobile_No("9876543210");
	orders.setDress_Name("kurta");
	orders.setBrand_Name("avaasa");
	orders.setColour("black");
	orders.setSize("XS");
	orders.setPrice("345");
	orders.setCount("5");
	orders.setTotal_Price("543");
	
	System.out.println(orders);
	OrdersValidation.Ordersvalidation(orders);
}
	}