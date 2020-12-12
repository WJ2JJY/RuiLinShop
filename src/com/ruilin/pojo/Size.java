package com.ruilin.pojo;

public class Size {
	private int sizeid; //尺寸大小
	private int sizetype; //尺寸类型
	public Size(int sizeid, int sizetype) {
		super();
		this.sizeid = sizeid;
		this.sizetype = sizetype;
	}
	public Size() {
		super();
	}
	public int getSizeid() {
		return sizeid;
	}
	public void setSizeid(int sizeid) {
		this.sizeid = sizeid;
	}
	public int getSizetype() {
		return sizetype;
	}
	public void setSizetype(int sizetype) {
		this.sizetype = sizetype;
	}
}
