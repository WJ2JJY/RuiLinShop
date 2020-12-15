package com.ruilin.pojo;

public class Goods {
	private int goodsid;//商品编号
	private String goodsname;//商品名称
	private int goodsprice; //商品初始价格
	private int brandtypeId;//品牌系列编号
	private int volume;//商品销量
	private int repertory;//商品库存数量
	private int sizeid;//商品初始尺寸编号
	private int recentlysold;//商品最近销量
	private String productid;//商品产品编号
	private String certificate;//商品证书
	private int textureid;//初始材质id
	private int imgid;//商品初始图片
	private int diamondid; //主钻初始编好
	public Goods(int goodsid, String goodsname, int goodsprice, int brandtypeId, int volume, int repertory, int sizeid,
			int recentlysold, String productid, String certificate, int textureid, int imgid, int diamondid) {
		super();
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
		this.brandtypeId = brandtypeId;
		this.volume = volume;
		this.repertory = repertory;
		this.sizeid = sizeid;
		this.recentlysold = recentlysold;
		this.productid = productid;
		this.certificate = certificate;
		this.textureid = textureid;
		this.imgid = imgid;
		this.diamondid = diamondid;
	}
	public Goods() {
		super();
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(int goodsprice) {
		this.goodsprice = goodsprice;
	}
	public int getBrandtypeId() {
		return brandtypeId;
	}
	public void setBrandtypeId(int brandtypeId) {
		this.brandtypeId = brandtypeId;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getRepertory() {
		return repertory;
	}
	public void setRepertory(int repertory) {
		this.repertory = repertory;
	}
	public int getSizeid() {
		return sizeid;
	}
	public void setSizeid(int sizeid) {
		this.sizeid = sizeid;
	}
	public int getRecentlysold() {
		return recentlysold;
	}
	public void setRecentlysold(int recentlysold) {
		this.recentlysold = recentlysold;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public int getTextureid() {
		return textureid;
	}
	public void setTextureid(int textureid) {
		this.textureid = textureid;
	}
	public int getImgid() {
		return imgid;
	}
	public void setImgid(int imgid) {
		this.imgid = imgid;
	}
	public int getDiamondid() {
		return diamondid;
	}
	public void setDiamondid(int diamondid) {
		this.diamondid = diamondid;
	}
	
	
	
}
