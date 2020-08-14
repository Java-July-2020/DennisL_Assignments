<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showProduct</title>
</head>
<body>
	<h1>showProduct.jsp</h1>
	<div>
		<h3>Product: <c:out value="${product.name}"></c:out></h3>
	</div>
	<div>
			<h4>Categories:</h4>
			<p>
				<c:forEach items="${categories}" var="category">
					<option value="${category.id}">${category.name}</option>
				</c:forEach>
			</p>
			<p>  
			    <button>Create</button>
			</p>
	</div>
</body>
</html>