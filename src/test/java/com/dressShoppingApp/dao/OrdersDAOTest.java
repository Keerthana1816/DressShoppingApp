package com.dressShoppingApp.dao;


import com.dressShoppingApp.model.Orders;
import com.dressShoppingApp.dao.OrdersDAOTest;

public class OrdersDAOTest {

public static void main(String[] args) throws Exception {
		
	    Orders o=new Orders();
		o.setDress_Name("kurta");
		o.setBrand_Name("avaasa");
		o.setColour("black");
		o.setSize("XL");
		o.setPrice("543");
		o.setCount("5");
		o.setTotal_Price("543");
		
		
		System.out.println(o);
		
		OrdersDAOImpl.addOrders(o);
}
}