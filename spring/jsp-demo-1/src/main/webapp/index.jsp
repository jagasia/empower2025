<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	float f=2.2f;
%>

<%

	//here, you can write any java code
	int i=20;
	int j=30;
	int k=i+j;
	
	out.print("The result is "+k);
	out.print("<br/>");

%>
Hello world.. Time now is <%=new Date() %>
</body>
</html>