<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/main.css">
	</head>
	<body id="mainBody">
		<!-- <a href="/languages/new">Create new Language</a> -->
		<div>
			<table id="tableOne">
			   <thead>
			        <tr class="rows">
			            <th class="thead">Name</th>
			            <th class="thead">Creator</th>
			            <th class="thead">Version</th>
			            <th class="thead">Action</th>
			        </tr>
			   </thead>
			    <tbody><c:forEach items="${languages}" var="language" varStatus="loop">
			    	<tr class="rows">
						<td class="tbody"><a href="/languages/${language.id}">${language.name}</a></td>
						<td class="tbody">${language.creator}</td>
						<td class="tbody">${language.currentVersion}</td>
						<td class="tbody"><a href="/languages/delete/${language.id}">delete </a><a href="/languages/${language.id}/edit">edit</a></td>
			    	</tr></c:forEach>
			    </tbody>
			</table>
		</div><br>
		<div id="submitForm">
			<form action="/languages" method="post">
				<p>
			    <label for="name" class="field">Name</label>
			    <input type="text" required minlength="3" maxlength="20" name="name" class="inputField"/>
			    </p>
			    <p>
			    <label for="creator" class="field">Creator</label>
			    <input type="text" required minlength="3" maxlength="20" name="creator" class="inputField"/>
			    </p>
				<p>
			    <label for="version" class="field">Version (default: 0.0)</label>
			    <input type="number" name="version" minlength="1" class="inputField"/>
			    </p>
			    <p><input type="submit" value="Submit" id="submitButton"/><p>
			</form>
		</div>
	</body>
</html>