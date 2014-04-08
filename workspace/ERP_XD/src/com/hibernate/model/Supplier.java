package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Supplier")
public class Supplier {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id; 
	@Column(name = "name")
	private String name; 
	@Column(name = "jc")
	private String jc;
	@Column(name = "address")
	private String address;
	@Column(name = "bianma")
	private String bianma;
	@Column(name = "tel")
	private String tel;
	@Column(name = "fax")
	private String fax;
	@Column(name = "lian")
	private String lian;
	@Column(name = "ltel")
	private String ltel;
	@Column(name = "yh")
	private String yh;
	@Column(name = "mail")
	private String mail;
	
	public Supplier(){}

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the bianma
	 */
	public String getBianma() {
		return bianma;
	}

	/**
	 * @param bianma the bianma to set
	 */
	public void setBianma(String bianma) {
		this.bianma = bianma;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the lian
	 */
	public String getLian() {
		return lian;
	}

	/**
	 * @param lian the lian to set
	 */
	public void setLian(String lian) {
		this.lian = lian;
	}

	/**
	 * @return the ltel
	 */
	public String getLtel() {
		return ltel;
	}

	/**
	 * @param ltel the ltel to set
	 */
	public void setLtel(String ltel) {
		this.ltel = ltel;
	}

	/**
	 * @return the yh
	 */
	public String getYh() {
		return yh;
	}

	/**
	 * @param yh the yh to set
	 */
	public void setYh(String yh) {
		this.yh = yh;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
}
