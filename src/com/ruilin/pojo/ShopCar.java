package com.ruilin.pojo;

public class ShopCar {
	private int shopcarid; //购物车编号
	private int id; //用户编号
	private int goodsid; // 商品编号
	private int cargoods; //商品数量
	private String jointime; //加入时间
	public ShopCar(int shopcarid, int id, int goodsid, int cargoods, String jointime) {
		super();
		this.shopcarid = shopcarid;
		this.id = id;
		this.goodsid = goodsid;
		this.cargoods = cargoods;
		this.jointime = jointime;
	}
	public ShopCar() {
		super();
	}
	public int getShopcarid() {
		return shopcarid;
	}
	public void setShopcarid(int shopcarid) {
		this.shopcarid = shopcarid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public int getCargoods() {
		return cargoods;
	}
	public void setCargoods(int cargoods) {
		this.cargoods = cargoods;
	}
	public String getJointime() {
		return jointime;
	}
	public void setJointime(String jointime) {
		this.jointime = jointime;
	}
	
}
