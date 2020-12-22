package com.ruilin.main;

import java.util.List;

import org.junit.Test;

import com.ruilin.dao.list.impl.FiltrateDaoImpl;
import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.pojo.Goods;
import com.ruilin.utils.SendEmail;

public class Demo {
	//测试类
	public static void main(String[] args) {
		SendEmail se = new SendEmail();
		se.getEcode("1029366496@qq.com");
		System.out.println(se.serch);
	}
}
