package com.ruilin.pojo;

public class Diamond {
	private int diamondid;//钻石编号
	private String type;
	private int goodsid;
	private String price;
	private String weight;
	private String single_drilling;
	private String number;
	private String neatness;
	private String color;
	private String cut;
	public Diamond(int diamondid, String type, int goodsid, String price, String weight, String single_drilling,
			String number, String neatness, String color, String cut) {
		super();
		this.diamondid = diamondid;
		this.type = type;
		this.goodsid = goodsid;
		this.price = price;
		this.weight = weight;
		this.single_drilling = single_drilling;
		this.number = number;
		this.neatness = neatness;
		this.color = color;
		this.cut = cut;
	}
	public Diamond() {
		super();
	}
	public int getDiamondid() {
		return diamondid;
	}
	public void setDiamondid(int diamondid) {
		this.diamondid = diamondid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSingle_drilling() {
		return single_drilling;
	}
	public void setSingle_drilling(String single_drilling) {
		this.single_drilling = single_drilling;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNeatness() {
		return neatness;
	}
	public void setNeatness(String neatness) {
		this.neatness = neatness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCut() {
		return cut;
	}
	public void setCut(String cut) {
		this.cut = cut;
	}
	
}
