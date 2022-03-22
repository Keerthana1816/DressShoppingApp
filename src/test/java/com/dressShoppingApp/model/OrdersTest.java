package com.dressShoppingApp.model;

import com.dressShoppingApp.dao.OrdersDAOImpl;
import com.dressShoppingApp.model.OrdersTest;

public class OrdersTest {

		public static void main(String[] args) throws Exception {
			
			Orders o=new Orders();
			o.setCustomer_Name("keerthana");
			o.setMobile_No("9876543210");
			o.setDress_Name("kurta");
			o.setBrand_Name("avaasa");
			o.setColour("black");
			o.setSize("XS");
			o.setPrice("345");
			o.setCount("5");
			o.setTotal_Price("543");
			
			System.out.println(o);
			OrdersDAOImpl.addOrders(o);
		}
}


	
	