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
                         placeholder="Book Id"      /> ${book.id}(You Can't Change this)<br /> 
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
                placeholder="Book Title" /> <br /> 
            </div>
            <div class="controls">    
            <input
                placeholder="ISBN" type="text" name="isbn" class="login-input"
                 /> <br />    
            </div>
            <div class="controls">
            <input
                type="text" name="author" class="login-input"
                placeholder="Author" /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="classno"  class="login-input" placeholder="Class Number"
                 /> <br /> 
            </div>
            <div class="controls">   
            <input
                type="text" name="rackno"  class="login-input" placeholder="Rack Number"
                /> <br />  
           </div>
           <div class="controls">
            <input
                type="text" name="count"  class="login-input" placeholder="Number of Books"
                 /> <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="doa"  class="login-input" placeholder="Date of Arrival" id="doa"
                 /> <br /> 
            </div>
            </div>
            
            
            
            <div style="width:45%; float:right;">
            
            <div class="controls">
            <input
                type="text" name="publisher"  class="login-input" placeholder="Publisher"
                 /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="edition"  class="login-input" placeholder="Edition"
                 /> <br /> 
            </div>
                
                

            
            <div class="controls">
            <input
                type="text" name="description"  class="login-input" placeholder="Description"
                 /> <br />
            </div>
            
            <div class="controls">
            <input
                type="text" name="keywords"  class="login-input" placeholder="Keywords"
                 />  <br /> 
            </div>
            
            <div class="controls">
            <input
                type="text" name="recordtype"  class="login-input" placeholder="Record Type"
                 />  <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="blevel"  class="login-input" placeholder="Bibliographic Level"
                 />  <br /> 
                
            </div>  
            <div class="controls"> 
            <input
                type="text" name="identifier"  class="login-input" placeholder="Heading Identifier"
                 /> <br /> 
            </div>
            <div class="controls">
            <input
                type="text" name="tmaterial"  class="login-input" placeholder="Type of Material"
                 /> <br /> 
            </div>
            
           </div> <!-- End of second 50% div  -->     
                
            
            <input  type="submit" value="Submit" class="login-submit" /> 
        </form>
	</div>
	</div>
</body>
</html>