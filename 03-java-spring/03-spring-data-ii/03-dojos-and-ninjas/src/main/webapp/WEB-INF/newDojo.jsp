<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http:/w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Homepage</title>
</head>
<body>
	<h1>New Dojo</h1>
	<div>
		<form:form method="POST" action="/dojos/new" modelAttribute="dojo">
			<p>
			    <form:label path="name">Name
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