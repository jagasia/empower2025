<%@page import="com.empower.demo.config.MyConfiguration"%>
<%@page import="com.empower.demo.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.empower.demo.model.ProductDaoImpl"%>
<%@page import="com.empower.demo.model.ProductDao"%>
<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="pc"> 
<table>
	<tr><td>Id:</td><td><input type="number" name="id" value="${product.id }" /></td></tr>
	<tr><td>Name:</td><td><input type="text" name="name" value="${product.name }" /></td></tr>
	<tr><td>Category:</td><td><input type="text" name="category" value="${product.category }" /></td></tr>
	<tr><td>Price:</td><td><input type="number" name="price" value="${product.price }" /></td></tr>
</table>
	<br/><br/>
	<input type="submit" name="btn" value="Add" />&nbsp;
	<input type="submit" name="btn" value="Update" />&nbsp;
	<input type="submit" name="btn" value="Delete" />&nbsp;
</form>
<br/>
<hr/>
<br/>
<table border="1">
<thead>
	<tr>
		<th>Id</th><th>Name</th><th>Category</th><th>Price</th><th></th>
	</tr>
</thead>
<tbody>	
	<c:forEach var="p" items="${products }">
		<c:if test="${p.price > 1000 }">
					<tr>
			<td>${p.id }</td>
			<td>${p.name }</td>
			<td>${p.category }</td>
			<td>${p.price }</td>
			<td>
				<a href="select?id=${p.id }">Select</a>
			</td>
		</tr>
		</c:if>
	</c:forEach>
</tbody>
</table>
</body>
</html>