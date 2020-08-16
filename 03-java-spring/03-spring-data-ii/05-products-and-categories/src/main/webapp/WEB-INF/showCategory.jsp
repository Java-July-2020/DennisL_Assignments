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
							<td><p>- ${product.name}</p></td>
					</c:when>
					<c:otherwise>
						<td></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
	</div>
	<div>
		<form method="POST" action="/categories/add">
			<p>
				<select name="productID">
					<c:forEach items="${products}" var="product">
						<c:choose>
							<c:when test="${category.products.contains(product)}">
							</c:when>
							<c:otherwise>
								<option value="${product.id}" >${product.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
				<input type="hidden" name="categoryID" value="${category.id}">
			</p>
			<p>  
			    <button>Create</button>
			</p>
		</form>
	</div>
</body>
</html>