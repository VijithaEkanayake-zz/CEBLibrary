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
                <th>Member ID</th>
                <th>Provident Fund No</th>
                <th>Name</th>
                <th>Designation</th>
                <th>Branch</th>
                <th>Contact Number</th>
                <th>Email</th>
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
            <c:forEach items="${members}" var="member">
                <tr>
                    <td><c:out value="" /> ${member.id}</td>
                    <td><c:out value="" /> ${member.pfNo}</td>
                    <td><c:out value="" /> ${member.name}</td>
                    <td><c:out value="" /> ${member.designation}</td>
                    <td><c:out value="" /> ${member.branch}</td>
                    <td><c:out value="" /> ${member.contactNo}</td>
                    <td><c:out value="" /> ${member.email}</td>
                    
                    <%
if(request.getAttribute("userLevel").equals("admin")){ %>
	<td><a href="MemberController?action=edit&memberId=<c:out value="${member.id}"/>">Update</a></td>
                    <td><a href="MemberController?action=delete&memberId=<c:out value="${member.id}"/>">Delete</a></td>
                    <td><a href="MemberController?action=view&memberId=<c:out value="${member.id}"/>">View Details</a></td>
<%}else{%>
	<td><a href="MemberController?action=view&memberId=<c:out value="${member.id}"/>">View Details</a></td>
<%}
%>
                    
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>