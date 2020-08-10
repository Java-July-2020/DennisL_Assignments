<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- New way -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
	<head>
	<title>My HomePage</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
		<table>
		    <thead>
		        <tr>
		            <th>First Name</th>
		            <th>Last Name</th>
		            <th>Age</th>
		        </tr>
		    </thead>
		    <tbody>
		    	<c:forEach items="${ninjas}" var="ninja">
		    	<c:if test="${ninja.dojo.id == dojo.id}">
			        <tr>
			            <td>${ninja.firstName}</td>
			            <td>${ninja.lastName}</td>
			            <td>${ninja.age}</td>
			        </tr>
			    </c:if>
		        </c:forEach>
		    </tbody>
		</table>
	</body>
</html>