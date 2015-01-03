<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="img/ceb.ico" />
<title>Ceylon Electricity Board</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style.css" type="text/css" /> 
<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>
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
                    <img src="images/Banner.jpg" />
                </div> -->

            <div id="topnav">

                <ul>
                    <li><a><img src="img/Banner.jpg" /></a></li>
                </ul>
            </div>