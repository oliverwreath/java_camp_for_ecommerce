<%@ page errorPage ="error.jsp" %>
<a>aaaa</a>
<b>bbb</b>
<%@ include file="content.jsp" %>
<% 
	int a = 3;
	int b = 3;
	if( a == b ){
		out.println("<p>a = b</p>");
	}
	out.println(dd);
%>