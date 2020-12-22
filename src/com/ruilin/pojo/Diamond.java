package com.ruilin.pojo;

public class Diamond {
	private int diamondid;//钻石编号
	private String type;
	private int goodsid;
	private String price;
	private int weight;
	private String single_drilling;
	private String number;
	private String neatness;
	private String color;
	private String cut;
	public Diamond(int diamondid, String type, int goodsid, String price, int weight, String single_drilling,
			String number, String neatness, String color, String cut) {
		super();
		this.diamondid = diamondid;
		this.type = type;
		this.goodsid = goodsid;
		this.price = price;
		this.weight = weight;
		this.single_drilling = single_drilling;
		this.number = number;
		this.neatness = neatness;
		this.color = color;
		this.cut = cut;
	}
	public Diamond() {
		super();
	}
	/**
	 * @return the diamondid
	 */
	public int getDiamondid() {
		return diamondid;
	}
	/**
	 * @param diamondid the diamondid to set
	 */
	public void setDiamondid(int diamondid) {
		this.diamondid = diamondid;
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
	 * @return the goodsid
	 */
	public int getGoodsid() {
		return goodsid;
	}
	/**
	 * @param goodsid the goodsid to set
	 */
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the single_drilling
	 */
	public String getSingle_drilling() {
		return single_drilling;
	}
	/**
	 * @param single_drilling the single_drilling to set
	 */
	public void setSingle_drilling(String single_drilling) {
		this.single_drilling = single_drilling;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the neatness
	 */
	public String getNeatness() {
		return neatness;
	}
	/**
	 * @param neatness the neatness to set
	 */
	public void setNeatness(String neatness) {
		this.neatness = neatness;
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
	 * @return the cut
	 */
	public String getCut() {
		return cut;
	}
	/**
	 * @param cut the cut to set
	 */
	public void setCut(String cut) {
		this.cut = cut;
	}
	
	
}
