<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	<title>Top Ten</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div id="topDiv">
			<p>Top Ten Songs</p>
			<a href="/dashboard">Dashboard</a>
		</div>
		<div id="botDiv">
			<table class="table table-dark">
			<thead>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</thead>
			<tbody><c:forEach items="${songs}" var="song">
				<tr>
					<td>${song.rating}</td>
					<td><a href="songs/${song.id}">${song.title}</a></td>
					<td>${song.artist}</td>
				</tr>
				</c:forEach>
			</tbody>
			</table>
		</div>
	</body>
</html>