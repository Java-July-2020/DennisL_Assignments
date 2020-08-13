<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	<div>
		<form:form method="POST" action="/products" modelAttribute="product">
			<p>
			    <form:label path="name">Name:
			    <form:errors path="name"/>
			    <form:input path="name"/></form:label>
			</p>
			<p>
			    <form:label path="description">Description:
			    <form:errors path="description"/>
			    <form:input path="description" type="textarea"/></form:label>
			</p>
			<p>
			    <form:label path="price">Price
			    <form:errors path="price"/>
			    <form:input path="price" type="decimal"/></form:label>
			</p>
			<p>  
			    <button>Create</button>
			</p>
		</form:form>
	</div>
</body>
</html>