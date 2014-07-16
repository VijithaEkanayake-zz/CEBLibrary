<%
if(request.getAttribute("userLevel").equals("member")){ %>
	<%@ include file="header.jsp" %>
<%}else{%>
	<%@ include file="admin/header.jsp" %>
<%}
%>
                <div class="span5">
	 <form method="POST" action='BookIssueController' name="frmIssuedBook" class="login" >
	 	
            <% //String action = request.getParameter("action");
                //System.out.println(action);
                System.out.println(session.getAttribute("username"));
            %>
            
     
            <div class="controls">
            <input
                type="text" name="member_id" class="login-input"
                placeholder="Member Id" /> <br /> 
            </div>
     
         
            <div class="controls">    
            <input
                type="hidden" name="command"  value="individualissues" class="login-input"
                 /> <br /> 
            </div>
            
            
            
            
            
                
            
            <input  type="submit" value="Issue" class="login-submit" /> 
        </form>
	</div>
</body>
</html>