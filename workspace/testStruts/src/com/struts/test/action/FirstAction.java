package com.struts.test.action;

public class FirstAction {
	private String uname;
	
	public String execute() throws Exception{
		System.out.println("Hi Struts2!!");
		if( "oliver".equals(getUname()) ){
			return "success";
		}else{
			return "error";
		}
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
}
