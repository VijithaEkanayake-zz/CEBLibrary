
<%
if(request.getAttribute("userLevel").equals("member")){ %>
<%@ include file="header.jsp"%>
<%}else{%>
<%@ include file="admin/header.jsp"%>
<%}
%>

<div class="container">
	<div class="content">
		<form class="cbp-mc-form" method="POST" action='MemberController' name="frmAddMember" >
			<div class="cbp-mc-column">
				<% String action = request.getParameter("action");
                System.out.println(action);
            %>
				<% if (action.equalsIgnoreCase("edit")) {%>
				<label for="id">Member ID</label> <input type="text" name="id"
					placeholder="Member ID" value="<c:out value="${member.id}" />"
					readonly="readonly" /> (You Can't Change this)
				<%} else {%>
				<label for="id">Member ID</label> <input type="text" name="id"
					placeholder="Member ID" />

				<%}%>


				<label for="pf_no">Provident Fund Number</label> <input type="text"
					name="pf_no" placeholder="Your Provident Fund Number"
					value="<c:out value="${member.pfNo}" />" /> <label for="password">Password</label>
				<input placeholder="Your Password" type="password" name="password"
					value="<c:out value="${member.password}" />" /> <label
					for="name">Name</label> <input type="text" name="name"
					placeholder="Your Full Name"
					value="<c:out value="${member.name}" />" /> 
						
						
					

			</div>
			<div class="cbp-mc-column">
			
			<label
					for="designation">Designation</label> <input type="text"
					name="designation" placeholder="Designation"
					value="<c:out value="${member.designation}" />" />
				<label for="branch">Branch</label> <input type="text" name="branch"
					placeholder="Branch" value="<c:out value="${member.branch}" />" />
					
					<label for="contactNo">Contact Number</label>
					<input type="text" name="contactNo"
						placeholder="Contact Number"
						value="<c:out value="${member.contactNo}" />" />
						
						
			<label for="email">Email Address</label>
					<input type="text" name="email"
						placeholder="Email Address"
						value="<c:out value="${member.email}" />" /> 
			
			
			</div>
			
			
			<div class="cbp-mc-column">
				<label for="officeAddr">Office Address</label>
				<textarea id="officeAddr" name="officeAddr"
					><c:out value="${member.officeAddr}" /></textarea>
			
			<label for="homeAddr">Home Address</label>
				<textarea id="homeAddr" name="homeAddr"
					><c:out value="${member.homeAddr}" /></textarea>
			</div>
			<div class="cbp-mc-submit-wrap">
				<input class="cbp-mc-submit" type="submit" value="Submit" />
			</div>
		</form>
	</div>
</div>
</body>
</html>