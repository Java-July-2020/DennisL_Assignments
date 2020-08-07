<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<title>My HomePage</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<h1>Licenses</h1>
		<a href="/licenses/new">Create a new license for our Database</a>
		<table class="table table-dark">
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>State:</td>
				<td>License Expire:</td>
			</tr>
		</thead>
		<tbody><c:forEach items="${licenses}" var="license">
			<tr>
				<td><a href="/persons/${license.person.id}">${license.person.firstName}</a></td>
				<td>${license.person.lastName}</td>
				<td>${license.state}</td>
				<td>${license.expiration_date}</td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
		
	</body>
</html>