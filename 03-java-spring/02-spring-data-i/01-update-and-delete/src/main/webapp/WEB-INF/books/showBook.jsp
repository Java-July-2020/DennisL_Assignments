<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
<h1>books/showBook.jsp</h1>
<h1><c:out value="${book.title}"/></h1>
<p>Description: <c:out value="${book.description}"/></p>
<p>Language: <c:out value="${book.language}"/></p>
<p>Number of Pages: <c:out value="${book.numberOfPages}"/></p>
<a href="/books/edit/${book.id}">Edit Book</a>
</body>