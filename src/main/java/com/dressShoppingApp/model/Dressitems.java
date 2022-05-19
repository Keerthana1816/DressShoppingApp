package com.dressshoppingapp.model;

public class Dressitems {

	private String dressIdNo;
	private String dressName;
	private String brandName;
	private String colour;
	private String price;

	public String getDressIdNo() {
		return dressIdNo;
	}

	public void setDressIdNo(String dressIdNo) {
		this.dressIdNo = dressIdNo;
	}

	public String getDressName() {
		return dressName;
	}

	public void setDressName(String DressName) {
		this.dressName = DressName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String BrandName) {
		this.brandName = BrandName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String toString() {
		return " dressIdNo=" + dressIdNo + ",dressName=" + dressName + ", brandName=" + brandName + ", colour=" + colour
				+ ", price=" + price + "";
	}

}
