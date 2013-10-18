<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style.css" type="text/css" /> 
<script type="text/javascript">
$(document).ready(function() {
	$('ul.form li a').click(
		function(e) {
			e.preventDefault(); // prevent the default action
			e.stopPropagation; // stop the click from bubbling
			$(this).closest('ul').find('.selected').removeClass('selected');
			$(this).parent().addClass('selected');
		});
});


</script>

</head>
<body>
<div id="top">

            </div>

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
                </ul>
            </div>
         	<div class="leftside">
         		<ul class="form">
		<li><a class="profile" href="#"><i class="icon-user"></i>Add Book</a></li>
		<li class=""><a class="messages" href="MemberController?action=insert"><i class="icon-envelope-alt"></i>Add Member</a></li>
		<li><a class="settings" href="MemberController?action=listmember"><i class="icon-cog"></i>Show All Members</a></li>
		<li><a class="logout" href="#"><i class="icon-signout"></i>List of Books</a></li>
		<li><a class="profile" href="#"><i class="icon-user"></i>Issue a Book</a></li>
		<li><a class="messages" href="#"><i class="icon-user"></i>Book Returns</a></li>
		<li><a class="settings" href="#"><i class="icon-cog"></i>Search</a></li>
		<li><a class="logout" href="#"><i class="icon-signout"></i>Logout</a></li>
	</ul>
         	
         	</div>