package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Goods")
public class Goods {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id; 
	@Column(name = "name")
	private String name; 
	@Column(name = "jc")
	private String jc;
	@Column(name = "cd")
	private String cd;
	@Column(name = "dw")
	private String dw;
	@Column(name = "gg")
	private String gg;
	@Column(name = "bz")
	private String bz;
	@Column(name = "ph")
	private String ph;
	@Column(name = "pzwh")
	private String pzwh;
	@Column(name = "memo")
	private String memo;
	@Column(name = "supplierName")
	private String supplierName;
	
	public Goods(){}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the jc
	 */
	public String getJc() {
		return jc;
	}
	/**
	 * @param jc the jc to set
	 */
	public void setJc(String jc) {
		this.jc = jc;
	}
	/**
	 * @return the cd
	 */
	public String getCd() {
		return cd;
	}
	/**
	 * @param cd the cd to set
	 */
	public void setCd(String cd) {
		this.cd = cd;
	}
	/**
	 * @return the dw
	 */
	public String getDw() {
		return dw;
	}
	/**
	 * @param dw the dw to set
	 */
	public void setDw(String dw) {
		this.dw = dw;
	}
	/**
	 * @return the gg
	 */
	public String getGg() {
		return gg;
	}
	/**
	 * @param gg the gg to set
	 */
	public void setGg(String gg) {
		this.gg = gg;
	}
	/**
	 * @return the bz
	 */
	public String getBz() {
		return bz;
	}
	/**
	 * @param bz the bz to set
	 */
	public void setBz(String bz) {
		this.bz = bz;
	}
	/**
	 * @return the ph
	 */
	public String getPh() {
		return ph;
	}
	/**
	 * @param ph the ph to set
	 */
	public void setPh(String ph) {
		this.ph = ph;
	}
	/**
	 * @return the pzwh
	 */
	public String getPzwh() {
		return pzwh;
	}
	/**
	 * @param pzwh the pzwh to set
	 */
	public void setPzwh(String pzwh) {
		this.pzwh = pzwh;
	}
	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	

	
	
}
