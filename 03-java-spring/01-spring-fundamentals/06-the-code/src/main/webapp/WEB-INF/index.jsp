<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<title>My HomePage</title>
	<link rel="stylesheet" type="text/css" href="main.css">
	</head>
	<body>
		<div id="mainDiv">
		<p id="error"><c:out value="${errors}"></c:out></p>
		<p>What is the the code?</p>
		<form method="post" action="/code">
			<input type="text" name="code">
			<button>Try Code</button>
		</form>
		</div>
	</body>
</html>