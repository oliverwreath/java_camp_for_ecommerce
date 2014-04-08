package com.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Sales")
public class Sales {
	@Id @GeneratedValue
	@Column(name = "sellID")
	private int sellID; 
	@Column(name = "pzs")
	private int pzs; 
	@Column(name = "je")
	private int je;
	@Column(name = "ysjl")
	private String ysjl;
	@Column(name = "khName")
	private String khName;
	@Column(name = "xsDate")
	private Date xsDate;
	@Column(name = "czy")
	private String czy;
	@Column(name = "jsr")
	private String jsr;
	@Column(name = "jsfs")
	private String jsfs;
	
	public Sales(){}

	public int getSellID() {
		return sellID;
	}

	public void setSellID(int sellID) {
		this.sellID = sellID;
	}

	public int getPzs() {
		return pzs;
	}

	public void setPzs(int pzs) {
		this.pzs = pzs;
	}

	public int getJe() {
		return je;
	}

	public void setJe(int je) {
		this.je = je;
	}

	public String getYsjl() {
		return ysjl;
	}

	public void setYsjl(String ysjl) {
		this.ysjl = ysjl;
	}

	public String getKhName() {
		return khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public Date getXsDate() {
		return xsDate;
	}

	public void setXsDate(Date xsDate) {
		this.xsDate = xsDate;
	}

	public String getCzy() {
		return czy;
	}

	public void setCzy(String czy) {
		this.czy = czy;
	}

	public String getJsr() {
		return jsr;
	}

	public void setJsr(String jsr) {
		this.jsr = jsr;
	}

	public String getJsfs() {
		return jsfs;
	}

	public void setJsfs(String jsfs) {
		this.jsfs = jsfs;
	}


}
