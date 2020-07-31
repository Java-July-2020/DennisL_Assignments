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
	<c:forEach items="${myBuildings}" var="building">
		<div class="building">
			<h3><c:out value="${building.getName()}"></c:out></h3>
			<p>(earn <c:if test="${building.getCanLose()}"> / lose </c:if><c:out value="${building.getMin()}"></c:out>-<c:out value="${building.getMax()}"></c:out> gold)</p>
			<form method="post" action="/getGold">
				<input type="hidden" name="building" value="<c:out value="${building.getName()}"></c:out>">
				<button>Find Gold!</button>
			</form>
		</div>
	</c:forEach>
	<h3>Activities</h3>
	<div>
	<textarea rows="10" cols="100" id="textArea">
		
	</textarea>
	</div>
</body>
</html>