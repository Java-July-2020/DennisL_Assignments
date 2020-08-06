<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<html>
	<head>
	<title>My HomePage</title>
	</head>
	<body>
		<h1>newLicense.jsp</h1>
		<form:form action="/licenses" method="post" modelAttribute="license">
			<p>Person:
				<form:select path = "person">
				   <form:option value = "NONE" label=""/>
				   <form:options items = "${persons}" />
				</form:select> 
		    </p>
		    <p>
		        <form:label path="state">State:</form:label>
		        <form:errors path="state"/>
		        <form:input path="state"/>
		    </p>
		    <p>
		        <form:label path="expiration_date">Expiration Date:</form:label>
		        <form:errors path="expiration_date"/>
		        <form:input path="expiration_date" type="date"/>
		    </p>   
		    <input type="submit" value="Create"/>
	</form:form>
	</body>
</html>