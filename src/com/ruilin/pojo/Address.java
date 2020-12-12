package com.ruilin.pojo;

public class Address {
	private int addressid; //地址编号
	private String shippingAddress; //收货地址
	private int userid;//用户编号
	public Address(int addressid, String shippingAddress, int userid) {
		super();
		this.addressid = addressid;
		this.shippingAddress = shippingAddress;
		this.userid = userid;
	}
	public Address() {
		super();
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
