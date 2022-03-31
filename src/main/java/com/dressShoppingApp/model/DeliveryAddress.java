package com.dressShoppingApp.model;

public class DeliveryAddress {
	
	private String OrderIdNo;
	private String Name;
	private String MoblieNo;
	private String DoorNo;
	private String Address;
	private String Location;
	private String District;
	private String State;
	
	
	
	public String getOrderIdNo() {
		return OrderIdNo;
	}
	public void setOrderIdNo(String orderIdNo) {
		this.OrderIdNo = orderIdNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getMoblieNo() {
		return MoblieNo;
	}
	public void setMoblieNo(String moblieNo) {
		this.MoblieNo = moblieNo;
	}
	public String getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(String doorNo) {
		this.DoorNo = doorNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		this.Location = location;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		this.District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String toString() {
		return " OrderIdNo=" + OrderIdNo + ", Name=" + Name + ",MoblieNo=" + MoblieNo + ",DoorNo=" + DoorNo + ", Address=" + Address + ", Location=" + Location
				+ ", District=" + District + ", State=" + State +"";
}
	
}
