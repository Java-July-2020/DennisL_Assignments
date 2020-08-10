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
	<h1>New Ninja</h1>
	<div>
		<form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
			<p>
				<form:label path="dojo">Dojo:</form:label>
				<form:errors path="dojo"></form:errors>
				<form:select path="dojo">
					<c:forEach items="${dojos}" var="dojo">
						<option value="${dojo.id}">${dojo.name}</option>
					</c:forEach>
				</form:select>
			</p>
			<p>
			    <form:label path="firstName">First Name:
			    <form:errors path="firstName"/>
			    <form:input path="firstName"/></form:label>
			</p>
			<p>
			    <form:label path="lastName">Last Name:
			    <form:errors path="lastName"/>
			    <form:input path="lastName"/></form:label>
			</p> 
			<p>
			    <form:label path="age">Age:
			    <form:errors path="age"/>
			    <form:input path="age" type="number"/></form:label>
			</p> 
			<p>  
			    <button>Create</button>
			</p>
		</form:form>
	</div>
</body>
</html>