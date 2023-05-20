package com.nimap2.model;

// 1 . we will create object of ProductInfo class using data from array

public class ProductInfo {
	
	int pid;
	String pname;
	int price;
	int cid;
	String cname;

	
	public ProductInfo() {
		super();

	}

	public ProductInfo(int pid, String pname, int price, int cid, String cname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.cid = cid;
		this.cname = cname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	} 
	
}
