package com.dressShoppingApp.model;

import java.util.Scanner;

import com.dressShoppingApp.dao.OrderDAOImpl;
import com.dressShoppingApp.dao.RegistrationDAOImpl;
import com.dressShoppingApp.model.OrderTest;
import com.dressShoppingApp.validation.OrderValidation;
import com.dressShoppingApp.validation.RegistrationValidation;
public class OrderTest {

	public static void main(String[] args) throws Exception {
		order();
	}
	public static void order() throws Exception {
			
			Scanner sc=new Scanner(System.in);
            
			System.out.println("Enter Dress Id No:");
			String DressIdNo=sc.next();
			System.out.println("Enter Size:");
			String Size=sc.next();
			System.out.println("Enter Price:");
			String Price=sc.next();
			System.out.println("Enter Quantity:");
			String Quantity=sc.next();
			System.out.println("Enter Total Price:");
			String TotalPrice=sc.next();
			
			
			Order o=new Order();
			
			o.setDressIdNo(DressIdNo);
			o.setSize(Size);
			o.setPrice(Price);
			o.setCount(Quantity);
			o.setTotalPrice(TotalPrice);
			
			int count=0;
			try
			{
			OrderValidation.validation(o);
			
			}
			catch(Exception e)
			{
				
				System.out.println(e.getMessage());
				System.out.println("You have entered a wrong Option");
				System.out.println("Enter Once again");
				count++;
				order();
			}

			if(count==0)
			{
				System.out.println("Your Order is placed successfully..\n");
				OrderDAOImpl.addOrders(o);
				System.out.println("Update Size");
				UpdateOrderTest.update();
			   
			   
			    
		} 
}

}
	
	