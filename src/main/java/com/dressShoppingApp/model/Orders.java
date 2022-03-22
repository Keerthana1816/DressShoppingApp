package com.dressShoppingApp.model;

public class Orders {
 
	
	 private String Customer_Name;
	 private String Mobile_No;
	 private String Dress_Name;
	 private String Brand_Name;
	 private String Colour;
	 private String Size;
	 private String Price;
	 private String Count;
	 private String Total_Price;
	 

	 public String getCustomer_Name() {
			return Customer_Name;
		}


		public void setCustomer_Name(String customer_Name) {
			Customer_Name = customer_Name;
		}


		public String getMobile_No() {
			return Mobile_No;
		}


		public void setMobile_No(String mobile_No) {
			Mobile_No = mobile_No;
		}
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


public String getSize() {
	return Size;
}


public void setSize(String size) {
	Size = size;
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


public String getCount() {
	return Count;
}

public void setCount(String count) {
	Count = count;
}


public String getTotal_Price() {
	return Total_Price;
}


public void setTotal_Price(String total_Price) {
	Total_Price = total_Price;
}


public String toString() {
	return " Customer_Name=" + Customer_Name + ", Mobile_No=" + Mobile_No + ", Dress_Name=" + Dress_Name + ", Brand_Name=" + Brand_Name  + ", Colour=" + Colour + ", Size=" + Size + ", Price=" + Price + ",Count=" + Count + ",Total_Price=" + Total_Price + "";
}



}
