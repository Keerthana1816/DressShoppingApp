package com.dressShoppingApp.model;

import com.dressShoppingApp.dao.DressitemsDAOImpl;
import com.dressShoppingApp.model.DressitemsTest;

public class DressitemsTest {

		public static void main(String[] args) throws Exception {
			
			Dressitems d=new Dressitems();
			d.setDress_Name("kurta");
			d.setBrand_Name("avaasa");
			d.setColour("black");
			d.setPrice("345");
			
			System.out.println(d);
			
			
			DressitemsDAOImpl.addDressitems(d);
		}
}

	
	

	