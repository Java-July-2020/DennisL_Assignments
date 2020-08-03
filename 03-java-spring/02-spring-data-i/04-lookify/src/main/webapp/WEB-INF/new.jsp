<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<head>
</head>
<body> 
	<h1>New Song</h1>
	<h1>new.jsp</h1>
	<form:form action="/dashboard" method="post" modelAttribute="song">
	    <p>
	        <form:label path="title">Title</form:label>
	        <form:errors path="title"/>
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="artist">Artist</form:label>
	        <form:errors path="artist"/>
	        <form:input path="artist"/>
	    </p>
	    <p>
	        <form:label path="rating">Rating (1-10)</form:label>
	        <form:errors path="rating"/>
	        <form:input type="number" path="rating"/>
	    </p>   
	    <input type="submit" value="Add Song"/>
	</form:form>
</body>