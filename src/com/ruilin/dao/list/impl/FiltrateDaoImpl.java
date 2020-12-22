package com.ruilin.dao.list.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ruilin.dao.list.FiltrateDao;
import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.pojo.Goods;
import com.ruilin.utils.Dbutils;

public class FiltrateDaoImpl implements FiltrateDao{
	private QueryRunner qr = new QueryRunner(Dbutils.getDataSource());

	@Override
	public List<ClassifyGoods> getVolume() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` GROUP BY goodsname ORDER BY volume DESC; ";
		List<ClassifyGoods> list=null;
		try {
			list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<ClassifyGoods> getMoney(int money,int type,int weight,int select) {
		// TODO Auto-generated method stub
		String sql = "";
		List<ClassifyGoods> list=null;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		switch (money) {
		case 1:
			two=5000;
			break;
		case 2:
			one=5000;
			two=10000;
			break;
		case 3:
			one=10000;
			two=20000;
			break;
		case 4:
			one=20000;
			two=1000000;
			break;
		default:
			one=0;
			two=1000000;
			break;
		}
		switch (weight) {
		case 1:
			three=0;
			four=10;
			break;
		case 2:
			three=10;
			four=29;
			break;
		case 3:
			three=30;
			four=49;
			break;
		case 4:
			three=50;
			four=99;
			break;
		case 5:
			three=100;
			four=1000;
			break;
		default:
			three=0;
			four=1000;
			break;
		}
		try {
			if(select==1){
				if(type==-1){
					sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE diamond.`price` BETWEEN ? AND ? AND diamond.`weight` BETWEEN ? AND ? GROUP BY goodsname ORDER BY volume DESC";
					list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class),one,two,three,four);
				}else{
					sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`= ? AND diamond.`price` BETWEEN ? AND ? AND diamond.`weight` BETWEEN ? AND ? GROUP BY goodsname ORDER BY volume DESC";
					list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class),type,one,two,three,four);
				}
			}else{
				if(type==-1){
					sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE diamond.`price` BETWEEN ? AND ? AND diamond.`weight` BETWEEN ? AND ? GROUP BY goodsname ORDER BY price DESC";
					list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class),one,two,three,four);
				}else{
					sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`= ? AND diamond.`price` BETWEEN ? AND ? AND diamond.`weight` BETWEEN ? AND ? GROUP BY goodsname ORDER BY price DESC";
					list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class),type,one,two,three,four);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ClassifyGoods> getAnyType(int type) {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`=? GROUP BY goodsname ORDER BY volume DESC";
		List<ClassifyGoods> list=null;
		
		try {
			list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class),type);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<Goods> getName(String name) {
		// TODO Auto-generated method stub
		
		List<Goods> list=null;
		if(name!=null&&!" ".equals(name)){
			try {
				String sql = "SELECT goodsid,goodsname FROM goods WHERE goodsname LIKE CONCAT('%',?,'%') limit 0,5";
				list = qr.query(sql, new BeanListHandler<Goods>(Goods.class),name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	@Override
	public List<ClassifyGoods> getMohu(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,price,volume,images FROM goods INNER JOIN diamond ON goods.`goodsid`=diamond.`goodsid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`goodsid`=? GROUP BY goodsname";
		List<ClassifyGoods> list=null;
		try {
			list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
