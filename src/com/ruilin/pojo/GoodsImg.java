package com.ruilin.pojo;

public class GoodsImg {
	private int picid;//图片编号
	private String images;//图片路径
	private int goodsid;//商品编号
	public int getPicid() {
		return picid;
	}
	public void setPicid(int picid) {
		this.picid = picid;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public GoodsImg(int picid, String images, int goodsid) {
		super();
		this.picid = picid;
		this.images = images;
		this.goodsid = goodsid;
	}
	public GoodsImg() {
		super();
	}
	
}
