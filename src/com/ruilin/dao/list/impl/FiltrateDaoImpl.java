package com.ruilin.dao.list.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ruilin.dao.list.FiltrateDao;
import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.utils.Dbutils;

public class FiltrateDaoImpl implements FiltrateDao{
	private QueryRunner qr = new QueryRunner(Dbutils.getDataSource());

	@Override
	public List<ClassifyGoods> getVolume() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,goodsprice,volume,images FROM goods INNER JOIN diamond ON goods.`diamondid`=diamond.`diamondid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` ORDER BY volume DESC; ";
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
	public List<ClassifyGoods> getParis() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,goodsprice,volume,images FROM goods INNER JOIN diamond ON goods.`diamondid`=diamond.`diamondid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`=1 ORDER BY volume DESC";
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
	public List<ClassifyGoods> getForever() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,goodsprice,volume,images FROM goods INNER JOIN diamond ON goods.`diamondid`=diamond.`diamondid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`=2 ORDER BY volume DESC";
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
	public List<ClassifyGoods> getJust() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,goodsprice,volume,images FROM goods INNER JOIN diamond ON goods.`diamondid`=diamond.`diamondid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`=3 ORDER BY volume DESC";
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
	public List<ClassifyGoods> getMyheart() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,goodsprice,volume,images FROM goods INNER JOIN diamond ON goods.`diamondid`=diamond.`diamondid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`=4 ORDER BY volume DESC";
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
	public List<ClassifyGoods> getTrue() {
		// TODO Auto-generated method stub
		String sql = "SELECT goodsname,`type`,color,goodsprice,volume,images FROM goods INNER JOIN diamond ON goods.`diamondid`=diamond.`diamondid` INNER JOIN goodsimg ON goodsimg.`picid`=goods.`imgid` WHERE goods.`brandtypeId`=5 ORDER BY volume DESC";
		List<ClassifyGoods> list=null;
		try {
			list = qr.query(sql, new BeanListHandler<ClassifyGoods>(ClassifyGoods.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
