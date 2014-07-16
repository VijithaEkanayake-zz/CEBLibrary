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
<body style="background-color: #368EE0;">
<div id="top"></div>

               <!--  <div id="banner">
                    <img src="images/Banner.jpg" />
                </div> -->

            <div id="topnav">

                <ul>
                    <li><a><img src="img/Banner.jpg" /></a></li>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Services</a></li>
                    <li><a href="#">Gallery</a></li>
                    <li><a href="#">Contact Us</a></li>
                    <li><a href="login.jsp">Member Login</a></li>
                </ul>
            </div>
<div class="container">

 <div class="row">
                <div class="span5">

	<form method="post" action="LoginController" class="login">

           <h1><img alt="" src="img/books.png">Library Management System</h1>                
	
           <label for="username">Username</label>
           
            <input style="margin: 0 0 5%;"
                type="text" name="username"  placeholder="Your Username" /> 
          
                
           <label for="password">Password</label>
           
            <input style="margin: 0 0 5%;"
                type="password" name="password"  placeholder="Your Password" />
            <!-- Clearn both sides -->
<div class="clear"></div>
            <input type="submit" value="submit"> 
            
            
    
        </form>
     
    </div>
        
        </div>
        </div>


<%@ include file="footer.jsp" %>