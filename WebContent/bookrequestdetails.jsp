<%@ include file="admin/header.jsp" %>
<div class="content">
	<table border=1 class="CSSTableGenerator">
        <thead>
            <tr>
                <th>Request ID</th>
                <th>Book ID</th>
                <th>Member ID</th>
                <th>Request Date</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${bookrequests}" var="bookrequests">
                <tr>
                    <td><c:out value="" /> ${bookrequests.requestId}</td>
                    <td><c:out value="" /> ${bookrequests.bookId}</td>
                    <td><c:out value="" /> ${bookrequests.memberId}</td>
                    <td><c:out value="" /> ${bookrequests.reqDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>