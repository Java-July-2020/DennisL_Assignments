<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="main.css">
	</head>
	<body>
		<h1>All Languages</h1>
		<!-- <a href="/languages/new">Create new Language</a> -->
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
		</div><br>
		<div>
			<form action="/languages" method="post">
				<p>
			    <label for="name">Name</label>
			    <input type="text" required minlength="3" maxlength="20" name="name"/>
			    </p>
			    <p>
			    <label for="creator">Creator</label>
			    <input type="text" required minlength="3" maxlength="20" name="creator"/>
			    </p>
				<p>
			    <label for="version">Version (default: 0.0)</label>
			    <input type="number" name="version" minlength="1"/>
			    </p>
			    <p><input type="submit" value="Submit"/><p>
			</form>
		</div>
	</body>
</html>