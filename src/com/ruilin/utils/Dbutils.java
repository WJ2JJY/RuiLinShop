package com.ruilin.utils;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Dbutils {
	private static DataSource ds = new ComboPooledDataSource();
	
	public static DataSource getDataSource(){
		return ds;
	}
	public static Connection getCon(){
		try {
			return ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
