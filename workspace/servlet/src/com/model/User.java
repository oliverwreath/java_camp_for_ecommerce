package com.model;

public class User {
	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public User(){
		userName = "";
		passWord = "";
	}
	
	public User(String uname, String pwd){
		userName = uname;
		passWord = pwd;
	}
	
}