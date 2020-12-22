package com.ruilin.dao.list;

import java.util.List;

import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.pojo.Goods;

public interface FiltrateDao {
	//遍历所以商品
	List<ClassifyGoods> getVolume();
	//遍历价格区间的商品
	List<ClassifyGoods> getMoney(int money,int type,int weight,int select);
	//遍历其中一种品牌
	List<ClassifyGoods> getAnyType(int type);
	//模糊查询名称
	List<Goods> getName(String name);
	//模糊查询显示
	List<ClassifyGoods> getMohu(int id);
}
