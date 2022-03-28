package com.dressShoppingApp.model;



public class Payment {
	
	private String OrderIdNo;
	private String PaymentOption;
	private String Price;
	private String DeliveryCharge;
	private String TotalAmount;
	
	public String getOrderIdNo() {
		return OrderIdNo;
	}

	public void setOrderIdNo(String orderIdNo) {
		this.OrderIdNo = orderIdNo;
	}

	public String getPaymentOption() {
		return PaymentOption;
	}

	public void setPaymentOption(String PaymentOption) {
		this.PaymentOption = PaymentOption;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String Price){
		this.Price = Price;
	}
	public String getDeliveryCharge() {
		return DeliveryCharge;
	}
	public void setDeliveryCharge(String DeliveryCharge) {
		this.DeliveryCharge = DeliveryCharge;
	}
	public String getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(String TotalAmount) {
		this.TotalAmount = TotalAmount;
	}

	public String toString() {
		return "Payment [ OrderIdNo=" + OrderIdNo + ",PaymentOption=" + PaymentOption + ", Price=" + Price + ", DeliveryCharge=" + DeliveryCharge
				+ ", TotalAmount=" + TotalAmount + "]";
	}

	

	}


