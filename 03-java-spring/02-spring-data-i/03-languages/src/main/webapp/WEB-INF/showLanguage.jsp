<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
<h1>showBook.jsp</h1>
<div>
<p><a href="/languages">Dashboard</a></p>
</div>
<div>
<p>Language: <c:out value="${language.name}"/></p>
<p>Creator: <c:out value="${language.creator}"/></p>
<p><a href="/languages/${language.id}/edit">Edit</a></p>
<p><a href="/languages/delete/${language.id}">Delete</a></p>
</div>
</body>