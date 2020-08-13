<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Categories</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<h1>Category.jsp</h1>
	<p><a href="categories/new">Add a new Category</a></p>
		<table class="table table-dark">
			<thead>
				<tr>
					<td>Category ID:</td>
					<td>Category Name:</td>
				</tr>
			</thead>
			<tbody><c:forEach items="${categories}" var="category">
				<tr>
					<td>${category.id}</td>
					<td><a href="/categories/${category.id}">${category.name}</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>