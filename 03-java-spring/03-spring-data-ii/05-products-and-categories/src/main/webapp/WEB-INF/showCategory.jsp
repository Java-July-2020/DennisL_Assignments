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
			<c:forEach items="${products}" var="product">
				<c:choose>
					<c:when test="${category.products.contains(product)}">
							<td>${product.name}</td>
					</c:when>
					<c:otherwise>
						<td></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
	</div>
	<div>
		<%--  <form method="POST" action="/categories/add"> --%>
			<p>
				<form:label path="products">Product:</form:label>
				<form:errors path="prodcuts"></form:errors>
				<form:select path="products">
					<c:forEach items="${products}" var="product">
						<option value="${product.id}">${product.name}</option>
					</c:forEach>
				</form:select>
			</p>
			<p>  
			    <button>Create</button>
			</p>
		<%--  </form> --%>
	</div>
</body>
</html>