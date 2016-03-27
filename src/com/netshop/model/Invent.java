package com.netshop.model;

import java.sql.Date;

public class Invent {
     public String type;
     public int innumb;
     public int outnumb;
     public int sid;
     public Date indate;
     public Date outdate;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getInnumb() {
		return innumb;
	}
	public void setInnumb(int innumb) {
		this.innumb = innumb;
	}
	public int getOutnumb() {
		return outnumb;
	}
	public void setOutnumb(int outnumb) {
		this.outnumb = outnumb;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	public Date getOutdate() {
		return outdate;
	}
	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}
	
}
