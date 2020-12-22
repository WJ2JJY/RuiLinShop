package com.ruilin.service.list.impl;

import java.util.List;

import com.ruilin.dao.list.impl.FiltrateDaoImpl;
import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.pojo.Goods;
import com.ruilin.service.list.FiltrateService;

public class FiltrateServiceImpl implements FiltrateService{
	FiltrateDaoImpl fdi = new FiltrateDaoImpl();
	@Override
	public List<ClassifyGoods> getVolume() {
		// TODO Auto-generated method stub
		return fdi.getVolume();
	}
	@Override
	public List<ClassifyGoods> getAnyType(int type) {
		// TODO Auto-generated method stub
			return fdi.getAnyType(type);
	}
	@Override
	public List<Goods> getName(String name) {
		// TODO Auto-generated method stub
		return fdi.getName(name);
	}
	@Override
	public List<ClassifyGoods> getMohu(int id) {
		// TODO Auto-generated method stub
		return fdi.getMohu(id);
	}
	@Override
	public List<ClassifyGoods> getMoney(int money, int type, int weight, int select) {
		// TODO Auto-generated method stub
		return fdi.getMoney(money,type,weight,select);
	}


}
