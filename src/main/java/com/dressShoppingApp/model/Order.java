package com.dressshoppingapp.model;

public class Order {

	private String id;
	private String size;
	private String price;
	private String count;
	private String totalPrice;

	public String getDressIdNo() {
		return id;
	}

	public void setDressIdNo(String dressIdNo) {
		this.id = dressIdNo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String quantity) {
		this.count = quantity;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String toString() {
		return "  id=" + id + ", size=" + size + ", price=" + price + ",count=" + count + ",totalPrice=" + totalPrice
				+ "";
	}
}
