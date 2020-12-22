package com.ruilin.pojo;

public class ClassifyGoods {
	private String goodsname;
	private String type;
	private String color;
	private int price;
	private String volume;
	private String images;
	public ClassifyGoods(String goodsname, String type, String color, int price, String volume, String images) {
		super();
		this.goodsname = goodsname;
		this.type = type;
		this.color = color;
		this.price = price;
		this.volume = volume;
		this.images = images;
	}
	public ClassifyGoods() {
		super();
	}
	/**
	 * @return the goodsname
	 */
	public String getGoodsname() {
		return goodsname;
	}
	/**
	 * @param goodsname the goodsname to set
	 */
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}
	/**
	 * @return the images
	 */
	public String getImages() {
		return images;
	}
	/**
	 * @param images the images to set
	 */
	public void setImages(String images) {
		this.images = images;
	}
	
	
}
