package com.netshop.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.netshop.model.User;


public class UserDao  {

//extends DAO<User>	
//	public List<User> getAll() {
//		String sql="select * from user";
//		return getForList(sql);
//	}
//
//	
//	public void save(User user) {
//		String sql="insert into user(u_name,u_password,u_tel,u_country,u_state,u_city,u_addr,u_zip) values(?,?,?,?,?,?,?,?)";
//		update(sql,user.getName(),user.getPassword(),user.getTel(),
//				user.getCountry(),user.getState(),user.getCity(),user.getAddr(),user.getZip());
//		
//	}
//
//	
//	public User get(Integer id) {
//		String sql="select u_id,u_name,u_password,u_tel,u_country,u_state,u_city,u_addr,u_zip from user where u_id=?";
//		return get(sql, id);
//	}
//
//	
//	public void delete(Integer id) {
//		String sql="delete from user where u_id=?";
//		update(sql, id);
//		
//	}
//
//	
//	public long getCountWithName(String name) {
//		String sql="select count(u_id) from user where u_name=?";
//		return getForValue(sql, name);
//	}
//
//	
//	public void update(User user) {
//		
//		
//	}
//
//	
//	public User findUserByUserName(String name) {
//		String sql="select u_name from user where u_name=?";
//		return getForValue(sql, name);
//		
//	}
//
//	
//	public User logintomatch(String name, String password) {
//		String sql="select c_name,c_password from customer where c_name=?,c_password";
//	    return getForValue(sql, name,password);
//	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public void register(User user) {
		String sqlStr = "insert into user(uname,pwd) values(?,?)";
		Object[] params = new Object[]{user.getUsername(),user.getUserpassword()};
		jdbcTemplate.update(sqlStr, params);
	}

	
	public User findUserByUserName(String userName) {
		String sqlStr = "select id,uname,pwd from user where uname=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[]{userName}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserid(rs.getInt("u_id"));
				user.setUsername(rs.getString("u_name"));
				user.setUserpassword(rs.getString("u_password"));
			}
		});
		return user;
	}

 
	 
	
	

}
