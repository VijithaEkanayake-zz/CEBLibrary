<%@ include file="admin/header.jsp" %>
<div class="content">
	<table border=1 class="CSSTableGenerator">
        <thead>
            <tr>
                <th>Book Acc No.</th>
                <th>Member ID</th>
                <th>Issued Date</th>
                <th>Issued Person</th>
                <th>Issue ID</th>
               
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${bookissues}" var="bookissues">
                <tr>
                    <td><c:out value="" /> ${bookissues.accNo}</td>
                    <td><c:out value="" /> ${bookissues.memberId}</td>
                    <td><c:out value="" /> ${bookissues.issuedDate}</td>
                    <td><c:out value="" /> ${bookissues.issuer}</td>
                    <td><c:out value="" /> ${bookissues.issueID}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>