<%
if(request.getAttribute("userLevel").equals("member")){ %>
	<%@ include file="header.jsp" %>
<%}else{%>
	<%@ include file="admin/header.jsp" %>
<%}
%>
<div class="content">
	<table border=1 >
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
                                    <%
if(request.getAttribute("userLevel").equals("admin")){ %>
	<th colspan=3>Action</th>
<%}else{%>
	<th>Action</th>
<%}
%>
                
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td><c:out value="" /> ${book.id}</td>
                    <td><c:out value="" /> ${book.title}</td>
                    <td><c:out value="" /> ${book.isbn}</td>
                    <td><c:out value="" /> ${book.author1}</td>
                    <td><c:out value="" /> ${book.classNo}</td>
                    <td><c:out value="" /> ${book.rackNo}</td>
                    <td><c:out value="" /> ${book.publisher}</td>
                    <td><c:out value="" /> ${book.edition}</td>
                    <%
if(request.getAttribute("userLevel").equals("admin")){ %>
					<td><a href="BookController?action=edit&bookId=<c:out value="${book.id}"/>">Update</a></td>
                    <td><a href="BookController?action=delete&bookId=<c:out value="${book.id}"/>">Delete</a></td>
                    <td><a href="BookController?action=viewbook&bookId=<c:out value="${book.id}"/>">View Details</a></td>
<%}else{%>
	 <td><a href="BookController?action=viewbook&bookId=<c:out value="${book.id}"/>">View Details</a></td>
<%}
%>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>