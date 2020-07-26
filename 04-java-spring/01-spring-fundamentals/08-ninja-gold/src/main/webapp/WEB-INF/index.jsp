<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http:/w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Ninja Gold</title>
	<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
	<h1>Ninja Gold</h1>
	<h3>Your Gold: <c:out value="${totalGold}"></c:out></h3>
	<div class="building">
		<h3>Farm</h3>
		<p>(earn 10-20 gold)</p>
		<form method="post" action="/getGold">
			<input type="hidden" name="building" value="farm">
			<button>Find Gold!</button>
		</form>
	</div>
		<div class="building">
		<h3>Cave</h3>
		<p>(earn 5-10 gold)</p>
		<form method="post" action="/getGold">
			<input type="hidden" name="building" value="cave">
			<button>Find Gold!</button>
		</form>
	</div>
		<div class="building">
		<h3>House</h3>
		<p>(earn 2-5 gold)</p>
		<form method="post" action="/getGold">
			<input type="hidden" name="building" value="house">
			<button>Find Gold!</button>
		</form>
	</div>
	<div class="building">
		<h3>Casino</h3>
		<p>(earns/lose 0-50 gold)</p>
		<form method="post" action="/getGold">
			<input type="hidden" name="building" value="casino">
			<button>Find Gold!</button>
		</form>
	</div>
</body>
</html>