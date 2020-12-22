package com.ruilin.service.index.impl;

import java.util.List;

import com.ruilin.dao.index.IndexDao;
import com.ruilin.dao.index.impl.IndexDaoimpl;
import com.ruilin.pojo.Size;
import com.ruilin.pojo.Texture;
import com.ruilin.service.index.IndexService;

public class IndexServiceImpl implements IndexService{
	
	private IndexDao index = new IndexDaoimpl();
	@Override
	public List<Texture> getTexture() {
		// TODO Auto-generated method stub
		return index.getTexture();
	}
	@Override
	public List<Size> getSize() {
		// TODO Auto-generated method stub
		return index.getSize();
	}

}
