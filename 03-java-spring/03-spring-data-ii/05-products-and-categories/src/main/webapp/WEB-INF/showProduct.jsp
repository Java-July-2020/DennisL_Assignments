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
			<c:forEach items="${categories}" var="category">
				<c:choose>
					<c:when test="${product.categories.contains(category)}">
							<td><p>- ${category.name}</p></td>
					</c:when>
					<c:otherwise>
						<td></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
	</div>
	<div>
		<form method="POST" action="/products/add">
			<p>
				<select name="categoryID">
					<c:forEach items="${categories}" var="category">
						<c:choose>
							<c:when test="${product.categories.contains(category)}">
							</c:when>
							<c:otherwise>
									<option value="${category.id}">${category.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
				<input type="hidden" name="productID" value="${product.id}">
			</p>
			<p>  
			    <button>Add</button>
			</p>
		</form>
	</div>
</body>
</html>