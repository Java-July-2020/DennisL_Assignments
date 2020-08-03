<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body></body>   
		<h1>All Languages</h1>
		<a href="/languages/new">Create new Language</a>
		<div>
			<table>
			    <thead>
			        <tr>
			            <th>Language</th>
			            <th>Creator</th>
			            <th>Version</th>
			            <th>Action</th>
			        </tr>
			    </thead>
			    <tbody><c:forEach items="${languages}" var="language" varStatus="loop">
			    	<tr>
						<td><a href="/languages/${language.id}">${language.name}</a></td>
						<td>${language.creator}</td>
						<td>${language.currentVersion}</td>
						<td><a href="/languages/delete/${language.id}">delete </a><a href="/languages/${language.id}/edit">edit</a></td>
			    	</tr></c:forEach>
			    </tbody>
			</table>
		</div>
	</body>  
</html>