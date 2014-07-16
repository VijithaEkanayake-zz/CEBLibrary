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
                <th colspan=2>Individual Book Details Table</th>
          
            </tr>
        </thead>
        <tbody>
            
                <tr>
                	<td>Book Title</td>
                    <td><c:out value="${book.title}" /></td>
                </tr>
                <tr>
                	 <td>ISBN</td>
                    <td><c:out value="${book.isbn}" /></td>
                </tr>
                <tr>
                	<td>Author</td>
                    <td><c:out value="${book.author1}" /></td>
                </tr>
                <tr>
                	<td>Class Number</td>
                    <td><c:out value="${book.classNo}" /></td>
                </tr>
                <tr>
                	<td>Rack Number</td>
                    <td><c:out value="${book.rackNo}" /></td>
                </tr>
                <tr>
                	<td>Publisher</td>
                    <td><c:out value="${book.publisher}" /></td>
                </tr>
                <tr>
                	<td>Edition</td>
                    <td><c:out value="${book.edition}" /></td>
                </tr>
                <tr>
                	<td>Description</td>
                    <td><c:out value="${book.description}" /></td>
                </tr>
                <tr>
                	<td>Available Copies</td>
                    <td><c:out value="${requestScope.available_copies}" /></td>
                </tr>
                
        </tbody>
    </table>
    <% 
					int copies=Integer.parseInt(request.getAttribute("available_copies").toString());
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