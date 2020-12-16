package com.ruilin.dao.list;

import java.util.List;

import com.ruilin.pojo.ClassifyGoods;

public interface FiltrateDao {
	//遍历所以商品
	List<ClassifyGoods> getVolume();
	//遍历DR PARIS系列
	List<ClassifyGoods> getParis();
	
	//遍历FOREVER系列
	List<ClassifyGoods> getForever();
	
	List<ClassifyGoods> getJust();
	
	List<ClassifyGoods> getMyheart();
	
	List<ClassifyGoods> getTrue();
}
