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

<form method="post" action="/product/dml"> 
<table>
	<tr><td>Id:</td><td><input type="number" name="id" value="${product.id }" /></td></tr>
	<tr><td>Name:</td><td><input type="text" name="name" value="${product.name }" /></td></tr>
	<tr><td>Category:</td><td><input type="text" name="category" value="${product.category }" /></td></tr>
	<tr><td>Price:</td><td><input type="number" name="price" value="${product.price }" /></td></tr>
</table>
	<br/><br/>
	<input type="submit" name="add" value="Add" />&nbsp;
	<input type="submit" name="update" value="Update" />&nbsp;
	<input type="submit" name="delete" value="Delete" />&nbsp;
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
					<tr>
			<td>${p.id }</td>
			<td>${p.name }</td>
			<td>${p.category }</td>
			<td>${p.price }</td>
			<td>
				<a href="/product/select?id=${p.id }">Select</a>
			</td>
		</tr>
		
	</c:forEach>
</tbody>
</table>
</body>
</html>