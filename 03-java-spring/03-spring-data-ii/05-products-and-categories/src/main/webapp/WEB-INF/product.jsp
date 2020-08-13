<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<h1>Product.jsp</h1>
	<p><a href="products/new">Add a new Product</a></p>
		<table class="table table-dark">
			<thead>
				<tr>
					<td>Category</td>
					<td>Name</td>
					<td>Description</td>
					<td>Price</td>
				</tr>
			</thead>
			<tbody><c:forEach items="${products}" var="product">
				<tr>
					<td>place holder for product category</td>
					<td><a href="products/${product.id}">${product.name}</a></td>
					<td>${product.description}</td>
					<td>${product.price}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>