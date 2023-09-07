package com.like.model;

import java.util.*;

public interface LikeDAO {
	public void insert(LikeVO likeVO);
	public void update(LikeVO likeVO);
	public void delete(Integer likeID);
	public LikeVO findByPrimaryKey(Integer likeID);
	public List<LikeVO> getAll();

//	 萬用複合查詢(傳入參數型態Map)(回傳List)
//	public List<UseDiscountVO> getAll(Map<String, String[]> map);
}
