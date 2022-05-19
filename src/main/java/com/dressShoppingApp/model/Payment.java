package com.dressshoppingapp.model;

public class Payment {

	private String orderId;
	private String name;
	private String paymentOption;
	private String price;
	private String deliveryCharge;
	private String totalAmount;

	public String getOrderIdNo() {
		return orderId;
	}

	public void setOrderIdNo(String orderIdNo) {
		this.orderId = orderIdNo;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String PaymentOption) {
		this.paymentOption = PaymentOption;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String Price) {
		this.price = Price;
	}

	public String getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(String DeliveryCharge) {
		this.deliveryCharge = DeliveryCharge;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String TotalAmount) {
		this.totalAmount = TotalAmount;
	}

	public String toString() {
		return "Payment [ orderId=" + orderId + ",name=" + name + ",paymentOption=" + paymentOption + ", price=" + price
				+ ", deliveryCharge=" + deliveryCharge + ", totalAmount=" + totalAmount + "]";
	}

}
