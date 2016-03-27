package com.netshop.model;



public class User {
	
	
	public User(){}
	private int userid;//客户ID
	private String username;//客户登录名
	private String userpassword;//客户登录密码
	private String usertel;//客户联系电话
	private String usercountry;//客户所在国家
	private String userstate;//客户所在省
	private String usercity;//客户所在市
	private String useraddr;//客户所在具体地址
	private String userzip;//客户所在邮编
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	public String getUsercountry() {
		return usercountry;
	}
	public void setUsercountry(String usercountry) {
		this.usercountry = usercountry;
	}
	public String getUserstate() {
		return userstate;
	}
	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	public String getUseraddr() {
		return useraddr;
	}
	public void setUseraddr(String useraddr) {
		this.useraddr = useraddr;
	}
	public String getUserzip() {
		return userzip;
	}
	public void setUserzip(String userzip) {
		this.userzip = userzip;
	}
	
}
