<%@ include file="header.jsp"%>
<div class="container">
	<div class="content">
		<form class="cbp-mc-form" name="frmAddBook" method="POST"
			action='StandardController'>
			<div class="cbp-mc-column">
				<% String action = request.getParameter("action");
                System.out.println(action);
            %>
             <% java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
				<% if (action.equalsIgnoreCase("edit")) {%>

				<label for="book_id">Refference No.</label> <input type="text" name="refNo"
					placeholder="Refference No." value="<c:out value="${standard.refNo}" />"
					readonly="readonly" /> (You Can't Change this)

				<%} else {%>
				<label for="book_id">Refference No.</label> <input type="text" name="refNo"
					placeholder="Refference Number" />


				<%}%>
				<label
					for="type">Type</label> 
					<select name="type">
						<option value="-1">Selecte Type</option>
						<option value="H">Hard</option>
						<option value="S">Soft</option>
						<option value="HS">Hard/Soft</option>
					</select>
					
					<label
					for="edition">Edition</label> <input type="text" name="edition"
					placeholder="Enter The Edition"
					value="<c:out value="${standard.edition}" />" />
					
					
				<label for="amendment">Amendment</label> <input type="text"
					name="amendment" placeholder="Enter The Amendment"
					value="<c:out value="${standard.amendment}" />" />
					
					
					
			</div>
			<div class="cbp-mc-column">
			<label
					for="description">Description</label>
				<textarea id="description" name="description"
					><c:out value="${standard.description}" /></textarea>
				
				
					<label
					for="yop">Year of Publication</label> <input type="text"
					name="yop" placeholder="Enter The Year of Publication"
					value="<c:out value="${standard.yearOfPublished}" />" />
					<label
					for="yoa">Year of Amended</label> <input type="text"
					name="yoa" placeholder="Enter The Year of Amended"
					value="<c:out value="${standard.yearOfAmended}" />" />
			
			
			  
			
			
			
				
			</div>
			<div class="cbp-mc-column">
			<label for="location">Location </label> <input type="text" name="location"
					placeholder="Enter The Location"
					value="<c:out value="${standard.location}" />" />
					
					<label for="keywords">Keywords</label> <input type="text"
					name="keywords" placeholder="Enter The Keywords"
					value="<c:out value="${standard.keywords}" />" />
				<input
                type="hidden" name="dateentered"  value=""  placeholder="Entered Date"
                 />
                 
                 <input
                type="hidden" name="itemtype"  value="standards"  placeholder="Entered Date"
                 />
					
                 <input
                type="hidden" name="enteredby"  value="<% out.print(session.getAttribute("username")); %>" class="login-input" 
                 />

			</div>
			<div class="cbp-mc-submit-wrap">
				<input class="cbp-mc-submit" type="submit" value="Submit" />
			</div>
		</form>
	</div>
</div>
<%@ include file="../footer.jsp" %>