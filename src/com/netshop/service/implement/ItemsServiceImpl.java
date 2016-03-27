package com.netshop.service.implement;

import java.util.ArrayList;
import java.util.List;

import com.netshop.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {

	@Override
	public List Fuzzyquery(String name, String type) {
		List all = new ArrayList() ; 
		String sql = "SELECT item_name, FROM items WHERE item_name LIKE ? or item_type LIKE ?" ; 
		return null;
	}

}
