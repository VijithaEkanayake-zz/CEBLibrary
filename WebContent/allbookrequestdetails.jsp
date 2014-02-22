<%@ include file="admin/header.jsp" %>
<div class="content">
	<table border=1 class="CSSTableGenerator">
        <thead>
            <tr>
                <th>Request ID</th>
                <th>Book ID</th>
                <th>Member ID</th>
                <th>Request Date</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${allbookrequests}" var="bookrequests">
                <tr>
                    <td><c:out value="" /> ${bookrequests.requestId}</td>
                    <td><c:out value="" /> ${bookrequests.bookId}</td>
                    <td><c:out value="" /> ${bookrequests.memberId}</td>
                    <td><c:out value="" /> ${bookrequests.reqDate}</td>
                    
                    <td><a href="BookRequestController?action=issue&requestId=<c:out value="${bookrequests.requestId}"/>">Issue</a></td>
                    <td><a href="BookRequestController?action=reject&requestId=<c:out value="${bookrequests.requestId}"/>">Reject</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>