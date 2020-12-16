package com.ruilin.main;

import java.util.List;

import org.junit.Test;

import com.ruilin.dao.list.impl.FiltrateDaoImpl;
import com.ruilin.pojo.ClassifyGoods;

public class Demo {
	//测试类
	@Test
	public void test(){
		FiltrateDaoImpl fd = new FiltrateDaoImpl();
		List<ClassifyGoods> list = fd.getVolume();
		System.out.println(list.toString());
	}
}
