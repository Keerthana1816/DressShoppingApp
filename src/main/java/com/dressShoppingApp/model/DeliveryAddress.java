package com.dressshoppingapp.model;

public class DeliveryAddress {

	private String orderIdNo;
	private String name;
	private String moblieNo;
	private String doorNo;
	private String address;
	private String location;
	private String district;
	private String state;

	public String getOrderIdNo() {
		return orderIdNo;
	}

	public void setOrderIdNo(String orderIdNo) {
		this.orderIdNo = orderIdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoblieNo() {
		return moblieNo;
	}

	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return " orderIdNo=" + orderIdNo + ", name=" + name + ",moblieNo=" + moblieNo + ",doorNo=" + doorNo
				+ ", address=" + address + ", location=" + location + ", district=" + district + ", state=" + state
				+ "";
	}

}
