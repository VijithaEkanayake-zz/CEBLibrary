<%@ include file="admin/header.jsp" %>
                <div class="span5">
	 <form method="POST" action='BookIssueController' name="frmIssueBook" class="login" >
	 	
            <% String action = request.getParameter("action");
                //System.out.println(action);
                System.out.println(session.getAttribute("username"));
            %>
            
            
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
                type="text" name="doi"  class="login-input" placeholder="Date of Issue" id="doi"
                 /> <br /> 
            </div>
            <div class="controls">    
            <input
                type="hidden" name="issuer"  value="<% out.print(session.getAttribute("username")); %>" class="login-input" placeholder="Date of Issue" id="doi"
                 /> <br /> 
            </div>
            
            
            
            
            
                
            
            <input  type="submit" value="Issue" class="login-submit" /> 
        </form>
	</div>
</body>
</html>