package com.ruilin.pojo;

public class FirstDrill {
	private int id; //主钻编号
	private String type; //主钻类型
	private int goodsid; //商品编号
	private int price; //商品价格
	public FirstDrill(int id, String type, int goodsid, int price) {
		super();
		this.id = id;
		this.type = type;
		this.goodsid = goodsid;
		this.price = price;
	}
	public FirstDrill() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
