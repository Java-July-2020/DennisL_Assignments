<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	<title>My HomePage</title>
	<link rel="stylesheet" type="text/css" href="main.css">
	</head>
	<body>
		<h1>Dojo Survey Index.jsp</h1>
		<div id="mainDiv">
			<form method="post" action="/result">
				<div class="rows">
					<p>Your Name: <input type="text" name="name" class="inputs"></p>
				</div>
				<div class="rows">
					<p>
						<label for="locations">Dojo Location:</label>
						<select name="locations" id="locations" class="inputs">
							<option value="San Jose">San Jose</option>
							<option value="location2">Location2</option>
						</select>
					</p>
				</div>
				<div class="rows">
					<p>
						<label for="languages">Favorite Language:</label>
						<select name="languages" id="languages" class="inputs">
							<option value="Python">Python</option>
							<option value="Java">Java</option>
						</select>
					</p>
				</div>
					<p>Comment (optional):</p>
				<div class="rows">
					<p>
						<textarea rows="4" cols="50" name="comments"></textarea>
					</p>
				</div>
				<div class="rows">
					<button>Button</button>
				</div>
			</form>
		</div>
	</body>
</html>