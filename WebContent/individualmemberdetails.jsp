<%
if(request.getAttribute("userLevel").equals("member")){ %>
	<%@ include file="header.jsp" %>
<%}else{%>
	<%@ include file="admin/header.jsp" %>
<%}
%>
<div class="content">
     <div style="background: #3C3B37; width: 100%;"><input type="button" value="Back" onclick="history.back()"></div>       
	<table border=1>
        <thead>
            <tr>
                <th colspan=2>Individual Member Details</th>
          
            </tr>
        </thead>
        <tbody>
            
                <tr>
                	<td>Provident Fund Number</td>
                    <td><c:out value="${member.pfNo}" /></td>
                </tr>
                <tr>
                	 <td>Name</td>
                    <td><c:out value="${member.name}" /></td>
                </tr>
                <tr>
                	<td>Designation</td>
                    <td><c:out value="${member.designation}" /></td>
                </tr>
                <tr>
                	<td>Email Address</td>
                    <td><c:out value="${member.email}" /></td>
                </tr>
                <tr>
                	<td>Office Address</td>
                    <td><c:out value="${member.officeAddr}" /></td>
                </tr>
                <tr>
                	<td>Home Address</td>
                    <td><c:out value="${member.homeAddr}" /></td>
                </tr>
                <tr>
                	<td>Branch</td>
                    <td><c:out value="${member.branch}" /></td>
                </tr>
                <tr>
                	<td>Contact Number</td>
                    <td><c:out value="${member.contactNo}" /></td>
                </tr>
               
                
        </tbody>
    </table>
</div>

</body>
</html>