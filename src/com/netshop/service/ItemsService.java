package com.netshop.service;

import java.util.List;

public interface ItemsService {
	//根据商品名称、类别模糊查询商品
	public List Fuzzyquery(String name,String type);
}
