<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/ceb.ico" />
<title>CEB-Online Library System</title>

<link rel="stylesheet" href="css/style.css" type="text/css" />

</head>
<body>
<div id="top"></div>

              <div id="banner">
                    <img src="img/Banner.jpg" />
                </div>

<div class="container">

 <div class="row">
                <div class="span5">

	<form method="post" action="LoginController" class="login">
	<fieldset>
                            <h1>CEB Library Management System</h1><br />
	
           
           <div class="controls">
            <input
                type="text" name="username" class="login-input"
                placeholder="Your Username" /> <br />
           </div>
                
           
           <div class="controls">
            <input
                type="password" name="password" class="login-input"
                placeholder="Your Password" /> <br /> 
           </div>
                
            <input type="submit" value="submit" class="login-submit"> 
            
            <div class="about">            
                    Yet Not Registered!! <a href="MemberController?action=insert">Register Here</a>
                   
        </div>
            </fieldset>
        </form>
        
    </div>
        
        </div>
        </div>
</body>
</html>