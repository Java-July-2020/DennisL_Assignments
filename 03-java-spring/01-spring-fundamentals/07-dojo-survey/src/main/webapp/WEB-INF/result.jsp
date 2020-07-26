<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<title>My HomePage</title>
	<link rel="stylesheet" type="text/css" href="main.css">
	</head>
	<body>
		<h1>Submitted Info</h1>
		<div id="mainDiv">
			<div class="rows">
				<p>Your Name: <c:out value="${name}"></c:out></p>
			</div>
			<div class="rows">
				<p>Dojo Location: <c:out value="${location}"></c:out></p>
			</div>
			<div class="rows">
				<p>Favorite Language: <c:out value="${language}"></c:out>!!!</p>
			</div>
				<p>Comment: <c:out value="${comment}"></c:out></p>
			<div class="rows">
				<a href="http://localhost:8080">
   					<button>Go Back</button>
				</a>
			</div>
		</div>
	</body>
</html>