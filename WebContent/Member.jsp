<%@ include file="admin/header.jsp" %>

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
                         placeholder="Member Id"   value="<c:out value="${member.id}" />"  readonly="readonly" /> (You Can't Change this)<br /> 
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
                placeholder="Your Provident Fund Number" value="<c:out value="${member.pfNo}" />" /> <br /> 
            </div>
            <div class="controls">    
            <input
                placeholder="Your Password" type="password" name="password" class="login-input" value="<c:out value="${member.password}" />"
                 /> <br />    
            </div>
            <div class="controls">
            <input
                type="text" name="name" class="login-input"
                placeholder="Your Full Name" value="<c:out value="${member.name}" />" /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="designation"  class="login-input" placeholder="Designation" value="<c:out value="${member.designation}" />"
                 /> <br /> 
            </div>
            <div class="controls">   
            <input
                type="text" name="branch"  class="login-input" placeholder="Branch" value="<c:out value="${member.branch}" />"
                /> <br />  
           </div>
           <div class="controls">
            <input
                type="text" name="officeAddr"  class="login-input" placeholder="Office Address" value="<c:out value="${member.officeAddr}" />"
                 /> <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="homeAddr"  class="login-input" placeholder="Home Address" value="<c:out value="${member.homeAddr}" />"
                 /> <br /> 
            </div>
            </div>
            
            
            
            <div style="width:45%; float:right;">
            
            <div class="controls">
            <input
                type="text" name="contactNo"  class="login-input" placeholder="Contact Number" value="<c:out value="${member.contactNo}" />"
                 /> <br />
            </div>
            <div class="controls">    
            <input
                type="text" name="email"  class="login-input" placeholder="Email Address" value="<c:out value="${member.email}" />"
                 /> <br /> 
            </div>
                
                

            <% if (action.equalsIgnoreCase("edit")) {%>
            <div class="controls">
            <input
                type="text" name="doj"  class="login-input" placeholder="Date of enrolled" id="doe" value="<c:out value="${member.doj}" />"
                 readonly="readonly"/>(You Can't Change this)  <br />
            </div>
            <%} else {%>
            <div class="controls">
            <input
                type="text" name="doj"  class="login-input" placeholder="Date of enrolled" id="doe" 
                 />  <br /> 
            </div>
            <%}%>
            <div class="controls">
            <input
                type="text" name="doa"  class="login-input" placeholder="Date of Appointment" id="doa" value="<c:out value="${member.doa}" />"
                 />  <br /> 
            </div>
            <div class="controls">    
            <input
                type="text" name="dob"  class="login-input" placeholder="Date of Birth" id="dob" value="<c:out value="${member.dob}" />"
                 />  <br /> 
                
            </div>  
            <div class="controls"> 
            <input
                type="text" name="civilStatus"  class="login-input" placeholder="Civil Status" value="<c:out value="${member.civilStatus}" />"
                 /> <br /> 
            </div>
            <div class="controls">
            <input
                type="text" name="gender"  class="login-input" placeholder="Gender" value="<c:out value="${member.gender}" />"
                 /> <br /> 
            </div>
            <div class="controls">
            <input
                type="text" name="prof_qualifications"  class="login-input" placeholder="Professional qualifications" value="<c:out value="${member.prof_qualification}" />"
                 /> <br />
                
            
            </div>
           </div> <!-- End of second 50% div  -->     
                
            
            <input  type="submit" value="Submit" class="login-submit" /> 
        </form>
	</div>
	</div>
</body>
</html>