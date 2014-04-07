<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.model.User"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>欢迎登录，<%=((User)session.getAttribute("user")).getUserName() %></h1>
	<a href=exit.jsp>退出</a>
</body>
</html>