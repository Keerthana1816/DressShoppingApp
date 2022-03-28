package com.dressShoppingApp.model;

	import java.util.ArrayList;
	import java.util.List;
	import com.dressShoppingApp.model.Dressitems;
	import com.dressShoppingApp.model.ViewDressitems;
	public class ViewDressitemsTest {
		
	public static void main(String[] args) throws Exception {
		view();
	} 
	public static void view() throws Exception {
	
		List <Dressitems> dress=new ArrayList<Dressitems>();
		dress=ViewDressitems.showAll();
		
		show(dress);
	}
		
	public static void show(List<Dressitems> dress) {
		System.out.println("DressIdNo  DressName  BrandName  Colour  Price");
		for(Dressitems i:dress){
				System.out.println(i.getDressIdNo()+"\t\t"+i.getDressName()+"\t"+i.getBrandName()+"\t"+i.getColour()+"\t"+i.getPrice());
				
			}
	}
	}

