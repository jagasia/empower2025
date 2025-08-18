<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="login">
Username:<input type="text" name="username" required /><br/>
Password:<input type="password" name="password" required /><br/>
<input type="submit" value="Login" />
</form>
<%-- <%

	String message=request.getParameter("message");
	if(message!=null)
		out.println(message);
%> --%>

${param.message }
</body>
</html>