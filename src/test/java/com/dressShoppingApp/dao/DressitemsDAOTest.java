package com.dressShoppingApp.dao;

import com.dressShoppingApp.model.Dressitems;

public class DressitemsDAOTest {
	public static void main(String[] args) throws Exception {

	Dressitems dressitems = new Dressitems();
	
	Dressitems d=new Dressitems();
	d.setDress_Name("kurta");
	d.setBrand_Name("avaasa");
	d.setColour("black");
	d.setPrice("345");
	
	System.out.println(d);
	
	
	DressitemsDAOImpl.addDressitems(d);
}
}
	
