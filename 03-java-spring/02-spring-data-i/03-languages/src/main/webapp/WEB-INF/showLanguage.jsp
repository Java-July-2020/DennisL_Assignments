<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/show.css"/>
	</head>
	<body>
		<div>
			<p id="dashboardLink"><a href="/languages">Dashboard</a></p>
		</div>
		<div>
			<p>Language: <c:out value="${language.name}"/></p>
			<p>Creator: <c:out value="${language.creator}"/></p>
			<p>Version: <c:out value="${language.currentVersion}"/></p>
			<p><a href="/languages/${language.id}/edit">Edit</a></p>
			<p><a href="/languages/delete/${language.id}">Delete</a></p>
		</div>
	</body>
</html>