<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	<title>My DashBoard</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div id="topDiv">
			<a href="songs/new">Add New</a>
			<a href="search/topTen">Top Songs</a>
			<form action="songs/search" method="post">
	  			<input type="text" id="search" name="search">
	  			<input type="submit" value="Search Artist"/>
	 	 	</form>
		</div>
		<div id="botDiv">
			<table class="table table-dark">
			<thead>
				<tr>
					<td>Name</td>
					<td>Rating</td>
					<td>Actions</td>
				</tr>
			</thead>
			<tbody><c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="songs/${song.id}">${song.title}</a></td>
					<td>${song.rating}</td>
					<td><a href="/songs/delete/${song.id}">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
			</table>
		</div>
	</body>
</html>