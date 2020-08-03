<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="new.css">
	</head>
	<body>
		<h1>New Language</h1>
		<h1>new.jsp</h1>
		<form:form action="/languages" method="post" modelAttribute="language">
		    <p>
		        <form:label path="name">Name</form:label>
		        <form:errors path="name"/>
		        <form:input path="name"/>
		    </p>
		    <p>
		        <form:label path="creator">Creator</form:label>
		        <form:errors path="creator"/>
		        <form:input path="creator"/>
		    </p>
		    <p>
		        <form:label path="currentVersion">Version</form:label>
		        <form:errors path="currentVersion"/>     
		        <form:input type="number" path="currentVersion"/>
		    </p>    
		    <input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>