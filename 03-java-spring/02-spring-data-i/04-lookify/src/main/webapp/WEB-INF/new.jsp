<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<head>
</head>
<body>
	<div>
		<p><a href="/dashboard">Dashboard</a></p>
  	</div>
	<div id="formBox">
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
	</div> 
</body>