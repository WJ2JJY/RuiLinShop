package com.ruilin.pojo;

public class OrderList {
	private int listid; //订单编号
	private int id; //用户编号
	private int goodsid; // 商品编号
	private String ordertime; //交易时间
	private int ordercount; // 订单数量
	private String orderstate; //订单交易状态
	public OrderList(int listid, int id, int goodsid, String ordertime, int ordercount, String orderstate) {
		super();
		this.listid = listid;
		this.id = id;
		this.goodsid = goodsid;
		this.ordertime = ordertime;
		this.ordercount = ordercount;
		this.orderstate = orderstate;
	}
	public OrderList() {
		super();
	}
	public int getListid() {
		return listid;
	}
	public void setListid(int listid) {
		this.listid = listid;
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
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public int getOrdercount() {
		return ordercount;
	}
	public void setOrdercount(int ordercount) {
		this.ordercount = ordercount;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	
}
