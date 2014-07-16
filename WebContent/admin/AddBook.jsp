<%@ include file="header.jsp"%>
<div class="container">
	<div class="content">
		<form class="cbp-mc-form" name="frmAddBook" method="POST"
			action='BookController'>
			<div class="cbp-mc-column">
				<% String action = request.getParameter("action");
                System.out.println(action);
            %>
             <% java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>
				<% if (action.equalsIgnoreCase("edit")) {%>

				<label for="book_id">Acc No.</label> <input type="text" name="id"
					placeholder="Acc No." value="<c:out value="${book.id}" />"
					readonly="readonly" /> (You Can't Change this)

				<%} else {%>
				<label for="book_id">Acc No.</label> <input type="text" name="id"
					placeholder="Acc No." />


				<%}%>
				<label
					for="identifier">Heading Identifier</label> 
					<select name="identifier">
						<option value="-1">Select Heading Identifier</option>
						<option value="P">Persoanal Authors</option>
						<option value="C">Corporate Authors</option>
						<option value="M">Meeting</option>
						<option value="T">Title</option>
					</select>
				<label for="heading">Heading</label> <input type="text"
					name="heading" placeholder="Enter The Heading"
					value="<c:out value="${book.heading}" />" />
				
				<label for="title">Book Title</label> <input type="text"
					name="title" placeholder="Enter The Book Title"
					value="<c:out value="${book.title}" />" /> <label for="isbn">ISBN
					Number</label> <input placeholder="Enter The ISBN" type="text" name="isbn"
					value="<c:out value="${book.isbn}" />" />  
					<label
					for="publisher">Publisher</label> <input type="text"
					name="publisher" placeholder="Enter The Publisher"
					value="<c:out value="${book.publisher}" />" />
					<label
					for="yop">Year of Publication</label> <input type="text"
					name="yop" placeholder="Enter The Year of Publication"
					value="<c:out value="${book.yearofPublication}" />" />
					
					<label
					for="series">Series</label> <input type="text"
					name="series" placeholder="Enter The Series"
					value="<c:out value="${book.series}" />" />
					
					
					
					<label for="classno">Classification
					Number</label> <input type="text" name="classno"
					placeholder="Enter The Classification Number"
					value="<c:out value="${book.classNo}" />" /> <label for="rackno">Rack
					Number</label> <input type="text" name="rackno"
					placeholder="Enter The Rack Number"
					value="<c:out value="${book.rackNo}" />" />
					<label for="count">Count</label> <input type="text" name="count"
					placeholder="Enter The Number of Books"
					value="<c:out value="${book.noofBooks}" />" /> 
					
			</div>
			<div class="cbp-mc-column">
			
			  <label
					for="edition">Edition</label> <input type="text" name="edition"
					placeholder="Enter The Edition"
					value="<c:out value="${book.edition}" />" />
			<label for="author1">First Author</label>
				<input type="text" name="author1"
					value="<c:out value="${book.author1}" />"
					placeholder="Enter The First Author" />
					
			<label for="author2">Second Author</label>
				<input type="text" name="author2"
					value="<c:out value="${book.author2}" />"
					placeholder="Enter The Second Author" />
			<label for="author3">Third Author</label>
				<input type="text" name="author3"
					value="<c:out value="${book.author3}" />"
					placeholder="Enter The Third Author" />
			<label for="author4">Fourth Author</label>
				<input type="text" name="author4"
					value="<c:out value="${book.author4}" />"
					placeholder="Enter The Fourth Author" />
					
					
			<label for="cbody1">First Corporate Body</label>
				<input type="text" name="cbody1"
					value="<c:out value="${book.corporateBody1}" />"
					placeholder="Enter The Corporate Body" />
			
			
			<label for="cbody2">Second Corporate Body</label>
				<input type="text" name="cbody2"
					value="<c:out value="${book.corporateBody2}" />"
					placeholder="Enter The Corporate Body" />
					
			<label for="cbody3">Third Corporate Body</label>
				<input type="text" name="cbody3"
					value="<c:out value="${book.corporateBody3}" />"
					placeholder="Enter The Corporate Body" />
					
		<label for="cbody4">Fourth Corporate Body</label>
				<input type="text" name="cbody4"
					value="<c:out value="${book.corporateBody4}" />"
					placeholder="Enter The Corporate Body" />
			
			
				 <label
					for="description">Physical Description</label>
				<textarea id="description" name="description"
					><c:out value="${book.description}" /></textarea>
			</div>
			<div class="cbp-mc-column">
				<label for="doa">Date
					of Arrival</label> <input type="text" name="doa"
					placeholder="Enter The Date of Arrival" id="doa"
					value="<c:out value="${book.dateofArrival}" />" />

				<label for="keywords">Keywords</label> <input type="text"
					name="keywords" placeholder="Enter The Keywords"
					value="<c:out value="${book.keywords}" />" />  <label
					for="blevel">Bibliographic Level</label> 					
					<select name="blevel">
						<option value="-1">Select Bibliographic Level</option>
						<option value="M">Monographic</option>
						<option value="A">Article</option>
					</select>
					
					
					<label
					for="tmaterial">Type of Material</label>
					<select name="tmaterial">
						<option value="-1">Select Type of Material</option>
						<option value="CP">Conference Paper</option>
						<option value="A">Article</option>
						<option value="CH">Chapter</option>
					</select>
					
					<label for="geocode">Geographic Code</label>
				<input type="text" name="geocode"
					value="<c:out value="${book.geoCode}" />"
					placeholder="Enter The Geographic Code" />
					
					<label
					for="abstractofBook">Abstract</label>
				<textarea id="abstractofBook" name="abstractofBook"
					><c:out value="${book.abstractofBook}" /></textarea>
					
					<label
					for="bheading">Broad Heading / Notation</label>
				<textarea id="bheading" name="bheading"
					><c:out value="${book.broadHeading}" /></textarea>
					
					
					
				<label
					for="notes">Notes</label>
				<textarea id="notes" name="notes"
					><c:out value="${book.notes}" /></textarea>
					
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