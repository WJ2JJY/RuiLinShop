package com.ruilin.dao.index;

import java.util.List;

import com.ruilin.pojo.Size;
import com.ruilin.pojo.Texture;

public interface IndexDao {
	List<Texture> getTexture();
	List<Size> getSize();
}
