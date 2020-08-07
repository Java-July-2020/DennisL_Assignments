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
		<h1><c:out value="${person.firstName}"></c:out> <c:out value="${person.lastName}"></c:out></h1>
		<h3>License Number <c:out value="${person.license.number}"></c:out></h3>
		<h3>State <c:out value="${person.license.state}"></c:out></h3>
		<h3>Expiration <c:out value="${person.license.expiration_date}"></c:out></h3>
	</body>
</html>