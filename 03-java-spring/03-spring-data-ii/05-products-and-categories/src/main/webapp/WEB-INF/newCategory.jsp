<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Category</title>
</head>
<body>
	<h1>New Category</h1>
	<div>
		<form:form method="POST" action="/categories" modelAttribute="category">
			<p>
			    <form:label path="name">Name:
			    <form:errors path="name"/>
			    <form:input path="name"/></form:label>
			</p>
			<p>  
			    <button>Create</button>
			</p>
		</form:form>
	</div>
</body>
</html>