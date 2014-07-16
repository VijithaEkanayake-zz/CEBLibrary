<%@ include file="admin/header.jsp" %>
<div class="container">
	<div class="content">
                
                <form class="cbp-mc-form" method="POST" action='BookIssueController' name="frmIssueBook">
			
			<div class="cbp-mc-column">
			<% //String action = request.getParameter("action");
                //System.out.println(action);
                System.out.println(session.getAttribute("username"));
            %>
            <% java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
            
            <label for="acc_no">Acc. No.</label>
            <input type="text" name="acc_no"
                         placeholder="Acc. No.	"       />
            
            <label for="member_id">Member ID</label>
            <input
                type="text" name="member_id"
                placeholder="Member Id" /> 
                
            <label for="doi">Date of Issue</label>
            <input
                type="text" name="doi" placeholder="Date of Issue" id="doi" value="<% out.print(df.format(new java.util.Date())); %>"
                 /> 
                 
            <label for="dor">Date of Return</label>
            <input
                type="text" name="dor" placeholder="Date of Return" id="dor" value="<% out.print(session.getAttribute("returnDate")); %>"
                 />
                 
            <input
                type="hidden" name="issuer"  value="<% out.print(session.getAttribute("username")); %>" placeholder="Date of Issue"
                 />   
            <input
                type="hidden" name="command"  value="issuebook"  placeholder="Date of Issue"
                 />
            
			<div class="cbp-mc-submit-wrap">
				<input class="cbp-mc-submit" type="submit" value="Submit" />
			</div>
			
			
			</div>
			
		</form>
                
	</div>
	</div>
</body>
</html>