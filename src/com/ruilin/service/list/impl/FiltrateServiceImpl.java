package com.ruilin.service.list.impl;

import java.util.List;

import com.ruilin.dao.list.impl.FiltrateDaoImpl;
import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.service.list.FiltrateService;

public class FiltrateServiceImpl implements FiltrateService{
	FiltrateDaoImpl fdi = new FiltrateDaoImpl();
	@Override
	public List<ClassifyGoods> getVolume() {
		// TODO Auto-generated method stub
		return fdi.getVolume();
	}
	@Override
	public List<ClassifyGoods> getParis() {
		// TODO Auto-generated method stub
		return fdi.getParis();
	}
	@Override
	public List<ClassifyGoods> getForever() {
		// TODO Auto-generated method stub
		return fdi.getForever();
	}
	@Override
	public List<ClassifyGoods> getJust() {
		// TODO Auto-generated method stub
		return fdi.getJust();
	}
	@Override
	public List<ClassifyGoods> getMyheart() {
		// TODO Auto-generated method stub
		return fdi.getMyheart();
	}
	@Override
	public List<ClassifyGoods> getTrue() {
		// TODO Auto-generated method stub
		return fdi.getTrue();
	}

}
