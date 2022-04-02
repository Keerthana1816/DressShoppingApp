package com.dressShoppingApp.model;

public class Order {

	private String DressIdNo;
	private String Size;
	private String Price;
	private String Quantity;
	private String TotalPrice;

	public String getDressIdNo() {
		return DressIdNo;
	}

	public void setDressIdNo(String dressIdNo) {
		this.DressIdNo = dressIdNo;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		this.Size = size;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		this.Price = price;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setCount(String quantity) {
		this.Quantity = quantity;
	}

	public String getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.TotalPrice = totalPrice;
	}

	public String toString() {
		return "  DressIdNo=" + DressIdNo + ", Size=" + Size + ", Price=" + Price + ",Quantity=" + Quantity
				+ ",TotalPrice=" + TotalPrice + "";
	}
}
