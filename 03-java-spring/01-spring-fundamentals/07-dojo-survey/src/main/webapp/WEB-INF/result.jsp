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
				<p >Your Name: <span class="inputs"><c:out value="${name}" ></c:out></span></p>
			</div>
			<div class="rows">
				<p>Dojo Location: <span class="inputs"><c:out value="${location}"></c:out></span></p>
			</div>
			<div class="rows">
				<p>Favorite Language: <span class="inputs"><c:out value="${language}"></c:out>!!!</span></p>
			</div>
				<p>Comment: <span class="inputs"><c:out value="${comment}"></c:out></span></p>
			<div class="rows">
				<a href="http://localhost:8080">
   					<button>Go Back</button>
				</a>
			</div>
		</div>
	</body>
</html>