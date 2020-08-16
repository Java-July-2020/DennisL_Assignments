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
							<td>${category.name}</td>
					</c:when>
					<c:otherwise>
						<td></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
	</div>
	<div>
		<h4>Categories:</h4>
		<%--<form:form method="POST" action="/products/add">   --%>
			<p>
				<form:label path="categories">Category:</form:label>
				<form:errors path="categories"></form:errors>
				<form:select path="categories">
					<c:forEach items="${categories}" var="category">
						<option value="${category.id}">${category.name}</option>
					</c:forEach>
				</form:select>
			</p>
			<p>  
			    <button>Create</button>
			</p>
		<%--  </form:form> --%>
	</div>
</body>
</html>