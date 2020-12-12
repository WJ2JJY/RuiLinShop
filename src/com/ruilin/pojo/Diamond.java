package com.ruilin.pojo;

public class Diamond {
	private int diamondid;//钻石编号
	private String weight;//总钻重量
	private String singleDrilling;//单钻重量
	private int number;//钻石数量
	private String neatness;//钻石净度
	private String color;//钻石颜色
	private String cut;//钻石切工类型
	private int goodsid;//商品编号
	
	
	public Diamond() {
		super();
	}
	public Diamond(int diamondid, String weight, String singleDrilling, int number, String neatness, String color,
			String cut, int goodsid) {
		super();
		this.diamondid = diamondid;
		this.weight = weight;
		this.singleDrilling = singleDrilling;
		this.number = number;
		this.neatness = neatness;
		this.color = color;
		this.cut = cut;
		this.goodsid = goodsid;
	}
	public int getDiamondid() {
		return diamondid;
	}
	public void setDiamondid(int diamondid) {
		this.diamondid = diamondid;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSingleDrilling() {
		return singleDrilling;
	}
	public void setSingleDrilling(String singleDrilling) {
		this.singleDrilling = singleDrilling;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
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
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	
}
