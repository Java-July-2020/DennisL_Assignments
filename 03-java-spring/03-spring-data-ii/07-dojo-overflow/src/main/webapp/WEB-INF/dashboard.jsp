<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Questions Dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Questions Dashboard</h1><br>
		<table class="table table-dark">
			<thead>
				<tr>
					<td>Question</td>
					<td>Tags</td>
				</tr>
			</thead>
			<tbody><c:forEach items="${questions}" var="question">
				<tr>
					<td>${question.question}</td>
					<td>
						<c:forEach items="${tags}" var="tag">
							<c:choose>
								<c:when test="${question.tags.contains(tag)}">
										<span>${tag.subject}, </span>
								</c:when>
							</c:choose>
						</c:forEach>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<h4><a href="questions/new">New Question</a></h4>
	</div>
</body>
</html>