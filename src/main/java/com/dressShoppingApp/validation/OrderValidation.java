package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Order;


public class OrderValidation {
	public static void validation(Order order) throws Exception {
		if(order.getDressIdNo()!=null) {
		
		}
		else
		{
		throw new Exception("Dress Id No is not available");
		}
		
        if(order.getSize().contains("XS")||order.getSize().contains("S")||order.getSize().contains("M")||order.getSize().contains("L")||order.getSize().contains("XL")||order.getSize().contains("XXL")) {
			
		}
		else
		{
			throw new Exception("This Size is currently unavailable");
		}
		
		 }
	}


