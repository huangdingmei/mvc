package com.netshop.model;

import java.sql.Date;

public class Order {
   public int orderid;
   public int ordercid;
   public Date orderdate;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public int getOrdercid() {
	return ordercid;
}
public void setOrdercid(int ordercid) {
	this.ordercid = ordercid;
}
public Date getOrderdate() {
	return orderdate;
}
public void setOrderdate(Date orderdate) {
	this.orderdate = orderdate;
}

}
