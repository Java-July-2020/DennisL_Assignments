<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
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
						<td><a href="questions/${question.id}">${question.question}</a></td>
						<td>
						<c:forEach items="${question.tags}" var="tag">
							<span>${tag.subject}
								<c:if test="${question.tags.indexOf(tag) != question.tags.size() - 1 }">, </c:if>
							</span>
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