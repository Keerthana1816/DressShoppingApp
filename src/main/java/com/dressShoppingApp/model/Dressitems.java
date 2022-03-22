package com.dressShoppingApp.model;

public class Dressitems {

	     private String Dress_Name;
		 private String Brand_Name;
		 private String Colour;
		 private String Price;


	public String getDress_Name() {
		return Dress_Name;
	}


	public void setDress_Name(String dress_Name) {
		Dress_Name = dress_Name;
	}


	public String getBrand_Name() {
		return Brand_Name;
	}


	public void setBrand_Name(String brand_Name) {
		Brand_Name = brand_Name;
	}


	
	public String getColour() {
		return Colour;
	}


	public void setColour(String colour) {
		Colour = colour;
	}


	public String getPrice() {
		return Price;
	}


	public void setPrice(String price) {
		Price = price;
	}

	public String toString() {
		return "Dress_Name=" + Dress_Name + ", Brand_Name=" + Brand_Name  + ", Colour=" + Colour + ",  price=" + Price + "";
	}
	}

