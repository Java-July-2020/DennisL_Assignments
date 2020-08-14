<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Category</title>
</head>
<body>
	<h1>showCategory.jsp</h1>
	<div>
		<h3>Category: <c:out value="${category.name}"></c:out></h3>
	</div>
	<div>
			<h4>Products:</h4>
			<p>
				<c:forEach items="${products}" var="product">
					<option value="${product.id}">${product.name}</option>
				</c:forEach>
			</p>
			<p>  
			    <button>Create</button>
			</p>
	</div>
</body>
</html>