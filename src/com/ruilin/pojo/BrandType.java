package com.ruilin.pojo;

public class BrandType {
	private int typeid;//品牌编号
	private String series;//品牌系列
	private int goodsid;//商品编号
	public BrandType(int typeid, String series,int goodsid) {
		super();
		this.typeid = typeid;
		this.series = series;
		this.goodsid = goodsid;
	}
	public BrandType() {
		super();
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	
}
