<%@ include file="header.jsp" %>
	<div class="container">
	<div class="content">
	 <form method="POST" action='MemberController' name="frmAddMember" class="login" style="width:960px;">
	 	<div style="width:45%; float:left;">
            <% String action = request.getParameter("action");
                System.out.println(action);
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
            <div class="controls">
            Member ID : <input type="text" name="id" class="login-input"
                         placeholder="Member Id"      /> ${member.id}(You Can't Change this)<br /> 
             </div>
            <%} else {%>
            <div class="controls">
            <input type="text" name="id" class="login-input"
                         placeholder="Member Id"       /> <br />
            </div>
            <%}%>
            <div class="controls">
            <input
                type="text" name="pf_no" class="login-input"
                placeholder="Your Provident Fund Number" /> <br /> 
            </div>
            <div class="controls">    
            <input
                placeholder="Your Password" type="password" name="password" class="login-input"
                 /> <br />    
            </div>
            <div class="controls">
            <input
                type="text" name="name" class="login-input"
                placeholder="Your Full Name" /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="designation"  class="login-input" placeholder="Designation"
                 /> <br /> 
            </div>
            <div class="controls">   
            <input
                type="text" name="branch"  class="login-input" placeholder="Branch"
                /> <br />  
           </div>
           <div class="controls">
            <input
                type="text" name="officeAddr"  class="login-input" placeholder="Office Address"
                 /> <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="homeAddr"  class="login-input" placeholder="Home Address"
                 /> <br /> 
            </div>
            </div>
            
            
            
            <div style="width:45%; float:right;">
            
            <div class="controls">
            <input
                type="text" name="contactNo"  class="login-input" placeholder="Contact Number"
                 /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="email"  class="login-input" placeholder="Email Address"
                 /> <br /> 
            </div>
                
                

            <% if (action.equalsIgnoreCase("edit")) {%>
            <div class="controls">
            <input
                type="text" name="doj"  class="login-input" placeholder="Date of enrolled"
                 readonly="readonly"/>(You Can't Change this)  <br />
            </div>
            <%} else {%>
            <div class="controls">
            <input
                type="text" name="doj"  class="login-input" placeholder="Date of enrolled"
                 />  <br /> 
            </div>
            <%}%>
            <div class="controls">
            <input
                type="text" name="doa"  class="login-input" placeholder="Date of Appointment"
                 />  <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="dob"  class="login-input" placeholder="Date of Birth"
                 />  <br /> 
                
            </div>  
            <div class="controls"> 
            <input
                type="text" name="civilStatus"  class="login-input" placeholder="Civil Status"
                 /> <br /> 
            </div>
            <div class="controls">
            <input
                type="text" name="gender"  class="login-input" placeholder="Gender"
                 /> <br /> 
            </div>
            <div class="controls">
            <input
                type="text" name="prof_qualifications"  class="login-input" placeholder="Professional qualifications"
                 /> <br />
                
            
            </div>
           </div> <!-- End of second 50% div  -->     
                
            
            <input  type="submit" value="Submit" class="login-submit" /> 
        </form>
	</div>
	</div>
</body>
</html>