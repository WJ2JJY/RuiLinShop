package com.ruilin.pojo;

public class Texture {
	private int textureid; //材质编号
	private String textureType; //材质类型
	private int goodsid; //商品编号
	public Texture(int textureid, String textureType, int goodsid) {
		super();
		this.textureid = textureid;
		this.textureType = textureType;
		this.goodsid = goodsid;
	}
	public Texture() {
		super();
	}
	public int getTextureid() {
		return textureid;
	}
	public void setTextureid(int textureid) {
		this.textureid = textureid;
	}
	public String getTextureType() {
		return textureType;
	}
	public void setTextureType(String textureType) {
		this.textureType = textureType;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	
}
