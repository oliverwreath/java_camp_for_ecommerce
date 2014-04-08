package com.hibernate.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_User")
public class User {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id; 
	@Column(name = "name")
	private String name; 
	@Column(name = "bday")
	private Date birthday; 
	
	public User(){}
	public User(String tmpName, Date tmpBday){
		name = tmpName;
		birthday = tmpBday;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	} 
	
}
