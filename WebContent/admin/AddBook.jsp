<%@ include file="header.jsp" %>
	<div class="container">
	<div class="content">
	 <form method="POST" action='BookController' name="frmAddBook" class="login" style="width:960px;">
	 	<div style="width:45%; float:left;">
            <% String action = request.getParameter("action");
                System.out.println(action);
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
            <div class="controls">
            Book ID : <input type="text" name="id" class="login-input"
                         placeholder="Book Id"   value="<c:out value="${book.id}" />"  readonly="readonly" /> (You Can't Change this)<br /> 
             </div>
            <%} else {%>
            <div class="controls">
            <input type="text" name="id" class="login-input"
                         placeholder="Book Id"       /> <br />
            </div>
            <%}%>
            <div class="controls">
            <input
                type="text" name="title" class="login-input"
                placeholder="Book Title" value="<c:out value="${book.title}" />" /> <br /> 
            </div>
            <div class="controls">    
            <input
                placeholder="ISBN" type="text" name="isbn" class="login-input" value="<c:out value="${book.isbn}" />"
                 /> <br />    
            </div>
            <div class="controls">
            <input
                type="text" name="author" class="login-input" value="<c:out value="${book.author}" />"
                placeholder="Author" /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="classno"  class="login-input" placeholder="Class Number" value="<c:out value="${book.classNo}" />"
                 /> <br /> 
            </div>
            <div class="controls">   
            <input
                type="text" name="rackno"  class="login-input" placeholder="Rack Number" value="<c:out value="${book.rackNo}" />"
                /> <br />  
           </div>
           <div class="controls">
            <input
                type="text" name="count"  class="login-input" placeholder="Number of Books" value="<c:out value="${book.noofBooks}" />"
                 /> <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="doa"  class="login-input" placeholder="Date of Arrival" id="doa" value="<c:out value="${book.dateofArrival}" />"
                 /> <br /> 
            </div>
            </div>
            
            
            
            <div style="width:45%; float:right;">
            
            <div class="controls">
            <input
                type="text" name="publisher"  class="login-input" placeholder="Publisher" value="<c:out value="${book.publisher}" />"
                 /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="edition"  class="login-input" placeholder="Edition" value="<c:out value="${book.edition}" />"
                 /> <br /> 
            </div>
                
                

            
            <div class="controls">
            <input
                type="text" name="description"  class="login-input" placeholder="Description" value="<c:out value="${book.description}" />"
                 /> <br />
            </div>
            
            <div class="controls">
            <input
                type="text" name="keywords"  class="login-input" placeholder="Keywords" value="<c:out value="${book.keywords}" />"
                 />  <br /> 
            </div>
            
            <div class="controls">
            <input
                type="text" name="recordtype"  class="login-input" placeholder="Record Type" value="<c:out value="${book.recordType}" />"
                 />  <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="blevel"  class="login-input" placeholder="Bibliographic Level" value="<c:out value="${book.bibliographicLevel}" />"
                 />  <br /> 
                
            </div>  
            <div class="controls"> 
            <input
                type="text" name="identifier"  class="login-input" placeholder="Heading Identifier" value="<c:out value="${book.headingIdentifier}" />"
                 /> <br /> 
            </div>
            <div class="controls">
            <input
                type="text" name="tmaterial"  class="login-input" placeholder="Type of Material" value="<c:out value="${book.typeofMaterial}" />"
                 /> <br /> 
            </div>
            
           </div> <!-- End of second 50% div  -->     
                
            
            <input  type="submit" value="Submit" class="login-submit" /> 
        </form>
	</div>
	</div>
</body>
</html>