<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="../img/ceb.ico" />
<title>Ceylon Electricity Board</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../css/style.css" type="text/css" /> 
<link rel="stylesheet" type="text/css" href="../css/default.css" />
		<link rel="stylesheet" type="text/css" href="../css/component.css" />
		<script src="../js/modernizr.custom.js"></script>
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	$( "#doa" ).datepicker();
	$( "#doa" ).datepicker( "option", "dateFormat", "yy-mm-dd" );
	$( "#dob" ).datepicker();
	$( "#dob" ).datepicker( "option", "dateFormat", "yy-mm-dd" );
	$( "#doe" ).datepicker();
	$( "#doe" ).datepicker( "option", "dateFormat", "yy-mm-dd" );
	$('ul.form li a').click(
		function(e) {
			//e.preventDefault(); // prevent the default action
			e.stopPropagation; // stop the click from bubbling
			$(this).closest('ul').find('.selected').removeClass('selected');
			$(this).parent().addClass('selected');
		});
	
});
</script>

 <script>
$(function() {

});
</script>

</head>
<body>
<div id="top">

            </div>

            <!--  <div id="banner">
                    <img src="../images/Banner.jpg" />
                </div> -->

            <div id="topnav">

                <ul>
                    <li><a><img src="../img/Banner.jpg" /></a></li>
                </ul>
            </div>
            
            <div class="leftside" id="leftmenu">
         		<ul class="form">
		<li><a class="profile" href="MemberController?action=listmember"><i class="icon-user"></i>Show All Members</a></li>
		<li><a class="messages" href="BookController?action=listbooks"><i class="icon-envelope-alt"></i>List of Books</a></li>
		<li><a class="settings" href="requestbook.jsp"><i class="icon-cog"></i>Search</a></li>
		<li><a class="logout" href="logout.jsp"><i class="icon-signout"></i>Logout</a></li>
	</ul>
         	
         	</div>

<div class="content">


		<form action="../StandardSearchController" method="post" class="cbp-mc-form">
		<div class="cbp-mc-column">
			<input type="text" name="search_text"  placeholder="Type Here Search"/>
		</div>
		<div class="cbp-mc-column">	
			<select name="criteria">
			<option value="-1">Select a Criteria</option>
			<option value="refno">Search by Reffence</option>
			<option value="description">Search by Description</option>
			
		
		</select>
		
		
		
		</div>	
		
		<div class="cbp-mc-column">
			<input class="cbp-mc-submit" type="submit" name="search_button">
		</div>
		</form>




</div>


</body>
</html>