package com.zrude.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "Myproduct")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pName;
	private String pDescription;
	
	private long price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Product(int pid, String pName, String pDescription, long price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pDescription = pDescription;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pDescription=" + pDescription + ", price=" + price + "]";
	}

	
	
	
}
