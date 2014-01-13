<%@ include file="admin/header.jsp" %>
                <div class="span5">
	 <form method="POST" action='BookController' name="frmIssueBook" class="login" >
	 	
            <% String action = request.getParameter("action");
                System.out.println(action);
            %>
            
            
            <div class="controls">
            <input type="text" name="b_id" class="login-input"
                         placeholder="Book Id"       /> <br />
            </div>
            <div class="controls">
            <input
                type="text" name="m_id" class="login-input"
                placeholder="Member Id" /> <br /> 
            </div>         
            
            <input  type="submit" value="Accept" class="login-submit" /> 
        </form>
	</div>
</body>
</html>