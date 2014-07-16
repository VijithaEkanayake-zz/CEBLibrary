<%
if(request.getAttribute("userLevel").equals("member")){ %>
	<%@ include file="header.jsp" %>
<%}else{%>
	<%@ include file="admin/header.jsp" %>
<%}
%>
                <div class="span5">
	 <form method="POST" action='BookReturnController' name="frmIssueBook" class="login" >
	 	
            <% String action = request.getParameter("action");
                System.out.println(action);
                System.out.println(session.getAttribute("username"));
            %>
            <% java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
            
            <div class="controls">
            <input type="text" name="acc_no" class="login-input"
                         placeholder="Book Id"       /> <br />
            </div>
            <div class="controls">
            <input
                type="text" name="member_id" class="login-input"
                placeholder="Member Id" /> <br /> 
            </div>
            <div class="controls">    
            <input
                type="hidden" name="dor" value="<% out.print(df.format(new java.util.Date())); %>"  class="login-input" placeholder="Date of Issue" id="dor"
                 /> <br /> 
            </div>
                     
            <div class="controls">    
            <input
                type="hidden" name="receiver"  value="<% out.print(session.getAttribute("username")); %>" class="login-input" 
                 /> <br /> 
            </div>
            
            
            <input  type="submit" value="Accept" class="login-submit" /> 
        </form>
	</div>
</body>
</html>