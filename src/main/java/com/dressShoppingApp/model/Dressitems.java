package com.dressShoppingApp.model;

public class Dressitems {
    
	private String DressIdNo;
	private String DressName;
	private String BrandName;
	private String Colour;
	private String Price;
	
	public String getDressIdNo() {
		return DressIdNo;
	}


	public void setDressIdNo(String dressIdNo) {
		this.DressIdNo = dressIdNo;
	}
	
	   public String getDressName() {
			return DressName;
		}


		public void setDressName(String DressName) {
		this.DressName = DressName;
		}


		public String getBrandName() {
			return BrandName;
		}


		public void setBrandName(String BrandName) {
			this.BrandName = BrandName;
		}
		public String getColour() {
			return Colour;
		}


		public void setColour(String colour) {
			this.Colour = colour;
		}
		public String getPrice() {
			return Price;
		}
		public void setPrice(String price) {
			this.Price = price;
		}

		public String toString() {
			return " DressIdNo=" + DressIdNo +",DressName=" + DressName + ", BrandName=" + BrandName  + ", Colour=" + Colour + ", Price=" + Price + "";
		}


		


		
}
