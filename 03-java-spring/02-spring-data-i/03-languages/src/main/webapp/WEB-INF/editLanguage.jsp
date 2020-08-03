<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<body>
<h1>editLanguage.jsp</h1>
<div>
<p><a href="/languages/delete/${language.id}">Delete </a> <a href="/languages"> Dashboard</a></p>
</div>
<div>
<h1><c:out value="${language.name}"/></h1>
<form:form action="/languages/${id}/edit" method="post" modelAttribute="language">
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
    <p><input type="submit" value="update"></p>
</form:form>
</div>
</body>