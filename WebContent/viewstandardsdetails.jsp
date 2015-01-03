<%
if(request.getAttribute("userLevel").equals("member")){ %>
	<%@ include file="headerstandards.jsp" %>
<%}else{%>
	<%@ include file="admin/header.jsp" %>
<%}
%>
<div class="content">
	<div style="background: #3C3B37; width: 100%;"><input type="button" value="Back" onclick="history.back()"></div>
            
	<table border=1>
        <thead>
            <tr>
                <th colspan=2>Individual Standard Details Table</th>
          
            </tr>
        </thead>
        <tbody>
            
                <tr>
                	<td>Standard Reference</td>
                    <td><c:out value="${standards.refNo}" /></td>
                </tr>
                <tr>
                	 <td>Type</td>
                    <td><c:out value="${standards.type}" /></td>
                </tr>
                <tr>
                	<td>Amendment</td>
                    <td><c:out value="${standards.amendment}" /></td>
                </tr>
                <tr>
                	<td>Description</td>
                    <td><c:out value="${standards.description}" /></td>
                </tr>
                <tr>
                	<td>Year of Publishedr</td>
                    <td><c:out value="${standards.yearOfPublished}" /></td>
                </tr>
                <tr>
                	<td>Edition</td>
                    <td><c:out value="${standards.edition}" /></td>
                </tr>
                
        </tbody>
    </table>
    <% 
					int copies=0;
					System.out.println("copies :++ "+copies);
					if(copies>0){ %>
					
					<a href="BookRequestController?action=viewrequest&bookId=<c:out value="${book.id}"/>"><h1 style="color :#46B525;">Request This Book</h1></a>
						
                <%}else { %>
                	<h1 style="color :#46B525;">No Copies Available for Request</h1>
                <%
                }
				%>
</div>

</body>
</html>