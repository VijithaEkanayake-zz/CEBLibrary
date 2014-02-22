<%@ include file="admin/header.jsp" %>
<div class="content">
	<table border=1 class="CSSTableGenerator">
        <thead>
            <tr>
                <th>Book ID</th>
                <th>Book Title</th>
                <th>ISBN</th>
                <th>Author</th>
                <th>Class Number</th>
                <th>Rack Number</th>
                <th>Publisher</th>
                <th>Edition</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td><c:out value="" /> ${book.id}</td>
                    <td><c:out value="" /> ${book.title}</td>
                    <td><c:out value="" /> ${book.isbn}</td>
                    <td><c:out value="" /> ${book.author}</td>
                    <td><c:out value="" /> ${book.classNo}</td>
                    <td><c:out value="" /> ${book.rackNo}</td>
                    <td><c:out value="" /> ${book.publisher}</td>
                    <td><c:out value="" /> ${book.edition}</td>
                    
                    <td><a href="BookController?action=viewbook&bookId=<c:out value="${book.id}"/>">View Details</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>