<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Question</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<h1>What is your question?</h1><br>
	<div class="container">
			<form:form action="/questions/add" method="post" modelAttribute="questions">
			    <div class="form-group">
			        <form:label path="question">Question:</form:label>
			        <form:errors path="question"/>
			        <form:input class="form-control" path="question"/>
			    </div>
				<div class=form-group>
					<form:label path="parseTags">Tags:</form:label>
			        <form:errors path="parseTags"/>
			        <form:input class="form-control" path="parseTags"/>
				</div>
				<div>
					<input class="btn btn-danger" type="submit" value="Submit"/>
				</div>
			</form:form>
	</div>
</body>
</html>