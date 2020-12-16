package com.ruilin.pojo;

public class ClassifyGoods {
	private String goodsname;
	private String type;
	private String color;
	private String goodsprice;
	private String volume;
	private String images;
	public ClassifyGoods(String goodsname, String type, String color, String goodsprice, String volume, String images) {
		super();
		this.goodsname = goodsname;
		this.type = type;
		this.color = color;
		this.goodsprice = goodsprice;
		this.volume = volume;
		this.images = images;
	}
	public ClassifyGoods() {
		super();
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	
	
}
