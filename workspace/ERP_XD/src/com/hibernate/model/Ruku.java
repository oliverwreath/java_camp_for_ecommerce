package com.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Ruku")
public class Ruku {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id; 
	@Column(name = "pzs")
	private int pzs; 
	@Column(name = "je")
	private int je;
	@Column(name = "ysjl")
	private String ysjl;
	@Column(name = "gysName")
	private String gysName;
	@Column(name = "rkDate")
	private Date rkDate;
	@Column(name = "czy")
	private String czy;
	@Column(name = "jsr")
	private String jsr;
	@Column(name = "jsfs")
	private String jsfs;
	
	public Ruku(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGysName() {
		return gysName;
	}

	public void setGysName(String gysName) {
		this.gysName = gysName;
	}

	public Date getRkDate() {
		return rkDate;
	}

	public void setRkDate(Date rkDate) {
		this.rkDate = rkDate;
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
