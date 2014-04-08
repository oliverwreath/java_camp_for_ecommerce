package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Ruku_detail")
public class Ruku_detail {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id; 
	@Column(name = "rkID")
	private String rkID; 
	@Column(name = "spID")
	private String spID;
	@Column(name = "dj")
	private int dj;
	@Column(name = "sl")
	private int sl;
	
	public Ruku_detail(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRkID() {
		return rkID;
	}

	public void setRkID(String rkID) {
		this.rkID = rkID;
	}

	public String getSpID() {
		return spID;
	}

	public void setSpID(String spID) {
		this.spID = spID;
	}

	public int getDj() {
		return dj;
	}

	public void setDj(int dj) {
		this.dj = dj;
	}

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	
}
