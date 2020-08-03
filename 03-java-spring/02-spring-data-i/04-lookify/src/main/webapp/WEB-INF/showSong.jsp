<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
	</head>
	<body>
		<div id="top">
			<p><a href="/dashboard">Dashboard</a></p>
		</div>
		<div id ="mid">
			<p>Title: <c:out value="${song.title}"/></p>
			<p>Artist: <c:out value="${song.artist}"/></p>
			<p>Rating: <c:out value="${song.rating}"/></p>
			<a href="/songs/delete/${song.id}">delete</a>
		</div>
	</body>
</html>