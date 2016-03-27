package com.netshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.netshop.model.Items;
import com.netshop.model.User;

public class ItemDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	//根据商品名查找商品
	public Items findItemByItemName(String itemName) {
		String sqlStr = "select item_name from items where item_name=?";
		final Items item = new Items();
		jdbcTemplate.query(sqlStr, new Object[]{itemName}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				item.setItemid(rs.getInt("item_id"));
				item.setItemname(rs.getString("item_name"));
				item.setItemmid(rs.getInt("item_mid"));
				item.setItemmoney(rs.getDouble("item_money"));
				item.setItemname(rs.getString("item_name"));
				item.setItemname(rs.getString("item_name"));
				item.setItemname(rs.getString("item_name"));
				item.setItemname(rs.getString("item_name"));
			}
		});
		return user;
	}

}
