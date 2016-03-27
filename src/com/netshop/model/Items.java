package com.netshop.model;

import java.util.Date;

public class Items {
    public int itemid;
    public int itemmid;
    public String itemname;
    public double itemmoney;
    public Date itemgdate;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getItemmid() {
		return itemmid;
	}
	public void setItemmid(int itemmid) {
		this.itemmid = itemmid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemmoney() {
		return itemmoney;
	}
	public void setItemmoney(double itemmoney) {
		this.itemmoney = itemmoney;
	}
	public Date getItemgdate() {
		return itemgdate;
	}
	public void setItemgdate(Date itemgdate) {
		this.itemgdate = itemgdate;
	}
	
}
