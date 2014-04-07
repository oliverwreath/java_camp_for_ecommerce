<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.controller.Login"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3><%=request.getAttribute("loginError")==null?"":request.getAttribute("loginError") %></h3>
		<form name="regFrm" action="handleLogin.jsp" method="post">
			用户名：<input type="text" name="uname" /><br/>
			密码：<input type="password" name="pwd" /><br/>
			<input type="submit" value="登录">
		</form>
	</body>
</html>