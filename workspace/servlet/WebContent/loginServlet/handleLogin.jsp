<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.model.User, java.lang.String"
%>
<%
	String uname = request.getParameter("uname");
	String pwd = request.getParameter("pwd");
	uname = uname.trim();
	pwd = pwd.trim();
	
	if("123".equals(uname) && "123".equals(pwd)){
		//登录成功
		User user = new User(uname, pwd);
		session.setAttribute("user", user);
		
		//转发或重定向
		pageContext.forward("login_OK.jsp");
		return; 
		
	}else{
		//登录失败
		request.setAttribute("loginError", "用户名或者密码错误！"+uname+"|"+pwd);
		pageContext.forward("login.jsp");
		return;
	}
%>