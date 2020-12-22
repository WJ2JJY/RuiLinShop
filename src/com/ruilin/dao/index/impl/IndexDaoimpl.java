package com.ruilin.dao.index.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ruilin.dao.index.IndexDao;
import com.ruilin.pojo.Size;
import com.ruilin.pojo.Texture;
import com.ruilin.utils.Dbutils;

public class IndexDaoimpl implements IndexDao{
	
	private QueryRunner qr = new QueryRunner(Dbutils.getDataSource());
	@Override
	public List<Texture> getTexture() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM texture";
		List<Texture> list=null;
		try {
			list = qr.query(sql, new BeanListHandler<Texture>(Texture.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<Size> getSize() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM size";
		List<Size> list=null;
		try {
			list = qr.query(sql, new BeanListHandler<Size>(Size.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
