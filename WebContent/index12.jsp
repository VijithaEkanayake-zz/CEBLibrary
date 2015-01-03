<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="UTF-8">
<title>Ceylon Electricity Board</title>
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS Styles -->
<link rel="stylesheet" type="text/css" href="css/skeleton.css">
<link rel="stylesheet" type="text/css" href="css/layout-white.css">
<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css">
<link rel="stylesheet" href="css/stylefront	.css" type="text/css" />
<!-- Favicons -->
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="images/apple-touch-icon-114x114.png">

<!-- Google Web Fonts -->
<link
	href="http://fonts.googleapis.com/css?family=Shadows+Into+Light|Oswald:400,300,700"
	rel="stylesheet" type="text/css">

<!-- JavaScripts -->
<script type="text/javascript" src="js/prefixfree.min.js"></script>
<script type="text/javascript" src="js/modernizr-2.6.2.js"></script>
<script type="text/javascript" src="js/iOS-timer.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
<script type="text/javascript" src="js/jquery.isotope.run.js"></script>
<script type="text/javascript" src="js/jquery.easing.min.js"></script>
<script type="text/javascript" src="js/jquery.mobile-touch-swipe-1.0.js"></script>
<script type="text/javascript" src="js/jquery.lazyload.js"></script>
<script type="text/javascript" src="js/jquery.flexslider.js"></script>
<script type="text/javascript" src="js/jquery.parallax-1.1.3.js"></script>
<script type="text/javascript" src="js/supersized.3.2.7.min.js"></script>
<script type="text/javascript" src="js/supersized.shutter.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/contact_form.js"></script>
<script type="text/javascript" src="js/tooltip.js"></script>
<script type="text/javascript" src="js/jquery.sticky.js"></script>


<script type="text/javascript">

			var isMobile = false;
	
			if( navigator.userAgent.match(/Android/i) || 
				navigator.userAgent.match(/webOS/i) ||
				navigator.userAgent.match(/iPhone/i) || 
				navigator.userAgent.match(/iPad/i)|| 
				navigator.userAgent.match(/iPod/i) || 
				navigator.userAgent.match(/BlackBerry/i)){
								
				isMobile = true;
							
			}
			
			/*iOS5 fixed-menu fix*/
			var iOS5 = false;
			
			if (navigator.userAgent.match(/OS 5(_\d)+ like Mac OS X/i)){
			
				iOS5 = true;
			
			}
		
			
	</script>

<!-- Google Maps Code -->
<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=true">
    </script>
<script type="text/javascript">
      function initialize() {
        var latlng = new google.maps.LatLng(-37.82179, 144.95302);
        var myOptions = {
          zoom: 12,
          center: latlng,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        var map = new google.maps.Map(document.getElementById("map_canvas"),
            myOptions);
      }

    </script>
<!-- END Google Maps Code -->

<script>
		$(document).ready(function(){
			$("nav").sticky({topSpacing:0});
		});
	</script>


</head>

<body>



	<!-- Start Homepage -->
	<div id="homepage" class="homepage section">

		<div class="container">
			<div class="sixteen columns">
				<img alt="" class="logo" src="images/logo.png" />
			</div>

			<div class="slider-text">
				<div class="sixteen columns">
					<div class="line"></div>
				</div>

				<div class="twelve columns">
					<div id="slidecaption"></div>
				</div>

				<div class="four columns">
					<a id="prevslide" class="load-item"></a> <a id="nextslide"
						class="load-item"></a>
				</div>
			</div>

		</div>
	</div>

	<!--End homepage -->

	<!-- Start Navigation -->
	<nav>

		<div class="container">

			<div class="sixteen columns">

				<!-- Start Nav Menu -->
				<ul class="menu" id="nav">
					<li><a href="#homepage">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#membership">Membership</a></li>
					<li><a href="#services">Services</a></li>
					<li><a href="#features">New Arrivals</a></li>
					<li><a href="#contact">Contact</a></li>
					<li><a href="#folio">Member Login</a></li>
				</ul>
				<!-- End Nav Menu -->
				<!-- Start Dropmenu for mobile -->
				<select class="dropmenu" name="dropmenu"
					onChange="moveTo(this.value)">
					<option value="" selected="selected">Menu</option>
					<option value="#homepage">Home</option>
					<option value="#about">About</option>
					<option value="#membership">Membership</option>
					<option value="#services">Services</option>
					<option value="#features">New Arrivals</option>
					<option value="#contact">Contact</option>
					<option value="#folio">Portfolio</option>
				</select>
				<!-- End Dropmenu for mobile -->

			</div>

		</div>

	</nav>
	<!-- End Navigation -->

	<!--start About -->
	<div id="about" class="page section">

		<div class="container aboutContainer">
			<div class="sixteen columns">
				<h3>
					<span class="largeBold">ABOUT US</span>
				</h3>
			</div>
			<br> <br> <br> <br>
			<p>There are more than 2000 registered members. CEB Library has a
				collection of over 4,000 books, local and foreign journals,
				periodicals and standards. They are mainly in the areas of the
				Electronic & Electrical Engineering, Civil Engineering, Mechanical
				Engineering, Chemical Engineering, Computer, Accountancy and
				Administration etc. Library received many popular and expensive
				journals, research papers and research project reports are also
				available in the library for reference. Large collection of
				completed CEB power project reports with as built drawings,
				maintenance manuals etc. available for reference. In addition to the
				main collection, Buddhist books collection donated by CEB Buddhist
				Society and other member donors are circulating among members.</p>
			<h5 class="mediumBold">
				<span class="highlight">Collections</span>
			</h5>
			<h6 class="smallBold">Lending Collection</h6>
			<p>The Lending Library has over 3500 books and library materials.
				Details of items in this collection can be found using the Online
				Library Catalogue.</p>

			<h6 class="smallBold">Periodicals Collection</h6>
			<p>This contains both current and back issues of periodicals,
				journals which are arranged in alphabetical order. This library
				received over 20 titles of current periodicals on subscription and
				20 titles of periodicals on Science & Technology, Energy,
				Engineering fields on free of charge.</p>

			<h6 class="smallBold">Reference Collection</h6>
			<p>The reference collection contains a wide variety of permanent
				reference materials such as encyclopedias, dictionaries,
				bibliographic, data books, manuals, engineering hand books . Any
				material required will be allowed to be photocopied.</p>

			<h6 class="smallBold">Standards Collection</h6>
			<P>Sri Lanka Standards Institution (SLSI) , the American Society
				of Testing Materials (ASTM) Standards, IEC Standards, British
				Standards (BS) and CEB standards are available for reference only.</P>

			<h6 class="smallBold">Theses & Dissertations Collection</h6>
			<p>The library holds copies of all higher degree theses and
				dissertations included by PG (Dip.), MPhil, and M.Eng.</p>

			<h6 class="smallBold">Special Collection (Project Reports)</h6>
			<p>CEB project reports are available in the Library for only
				reference. Separate collection of test reports done by CEB personnel
				is also available.</p>

			<h6 class="smallBold">CEB Document Collection</h6>
			<p>Documents related to CEB history, CEB Annual Reports in three
				languages, CEB manuals, CEB Administrative Reports, Documents
				related to Sri Lankan Power Industry, Acts and gazettes related to
				CEB available for reference of the users.</p>



		</div>

		<!--start parallax 2-->
		<div id="parallax-2" class="parallax fixed"
			style="background-image: url(images/parallax-2.jpg);">
			<div class="quoteWrap">
				<div class="quote">
					<div class="container">
						<div class="sixteen columns">
							<h3>
								<span class="smallBold">A room</span> <span class="small"></span>
								<br> <span class="large">without books</span> <span
									class="largeBold">is like a,</span> <br> <span
									class="medium">a body</span><span class="mediumBold">
									without a soul.</span> <br>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--end parallax 2-->

	</div>
	<!--end about-->
	<!--start membership -->
	<div id="membership" class="page section">

		<div class="container aboutContainer">
			<div class="sixteen columns">
				<h3>
					<span class="largeBold">Membership</span>
				</h3>
			</div>
			<br> <br> <br> <br> <a
				href="resources/Membership-application.docx" target="_blank"><h6
					class="smallBold">Download membership - application form</h6></a> <a
				href="resources/CEB LIBRARY-rules.docx" target="_blank"><h6
					class="smallBold">Download Library rule and regulations</h6></a>



		</div>

		<!--start parallax 2-->
		<div id="parallax-2" class="parallax fixed"
			style="background-image: url(images/parallax-2.jpg);">
			<div class="quoteWrap">
				<div class="quote">
					<div class="container">
						<div class="sixteen columns">
							<h3>
								<span class="smallBold">A room</span> <span class="small"></span>
								<br> <span class="large">without books</span> <span
									class="largeBold">is like a,</span> <br> <span
									class="medium">a body</span><span class="mediumBold">
									without a soul.</span> <br>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--end parallax 2-->

	</div>
	<!--end membership-->

	<!--start Services -->
	<div id="services" class="page section">

		<div class="container servicesContainer">
			<div class="sixteen columns">
				<h3>
					<span class="largeBold">CEB LIBRARY SERVICES</span>
				</h3>
				<br> <br>

				<p>The Library provides its services to the staff of CEB.</p>

				<h6 class="smallBold">Reference Services</h6>
				<h6 class="smallBold">Lending Services</h6>
				<h6 class="smallBold">Books and Periodicals</h6>
			</div>



		</div>

		<!--start parallax 3-->
		<div id="parallax-3" class="parallax fixed"
			style="background-image: url(images/parallax-3.jpg);">
			<div class="quoteWrap">
				<div class="quote">
					<div class="container">
						<div class="sixteen columns">
							<h3>
								<span class="largeBold">Intelligence</span> <span class="large">without
									ambition</span> <br> <span class="medium">is a bird</span> <span
									class="mediumBold">without wings.</span> <br> <span
									class="author">Salvador Dali</span>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--end parallax 3-->

	</div>
	<!--end services-->

	<!--start Features -->
	<div id="features" class="page section">

		<div class="container featuresContainer">
			<div class="sixteen columns">
				<h3>
					<span class="largeBold">NEW ARRIVALS</span>
				</h3>
				<img alt="High Voltage" src="img/new1.jpeg" width="250" height="350"
					style="padding: 5px;" /> <img alt="Applid Human resource"
					src="img/new2.jpeg" width="250" height="350" style="padding: 5px;" />

			</div>

		</div>

		<!--start parallax 4-->
		<div id="parallax-4" class="parallax fixed"
			style="background-image: url(images/parallax-4.jpg);">
			<div class="quoteWrap">
				<div class="quote">
					<div class="container">
						<div class="sixteen columns">
							<h3>
								<span class="largeBold">A Reader Lives</span> <span
									class="large">a thousand</span> <br>
								<span class="medium">lives before</span> <span
									class="mediumBold">he dies.</span> <br>
								<span class="large">The man who never read </span> <span
									class="largeBold">Lives only one.</span> <br>
								<span class="author">George R.R. Martin</span>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--end parallax 4-->

	</div>
	<!--end Features-->


	<!--start contact-->
	<div id="contact" class="page section">

		<div class="container contactContainer">
			<div class="sixteen columns">
				<h3>
					<span class="largeBold">CONTACT US</span>
				</h3>
			</div>

			<div class="three columns marginTop contactDetails">
				<p class="contactAddress">
					Ceylon Electricity Board Library<br />P.O. Box. 540, <br />
					Ceylon Electricity Board, <br />5th Floor, Sir Chittampalam A
					Gardiner Mawatha, <br />Colombo 02 <br /> SRI LANKA .<br />
					<a href="#?custom=true&width=500&height=500" rel="prettyPhoto">Google
						Map</a>
				</p>
			</div>
			<div class="three columns marginTop contactDetails">
				<p class="contactPhone">
					Phone: +94 -11- 2382647<br />Staff Members: Please use
					the Intercom Extensions to contact Library staff
				</p>
				<p class="contactPhone">
					Fax: +94-11-2325360<br />Intercom Extension: 219
				</p>
				<p class="contactEmail">
					Email: <a href="#">library@ceb.lk</a>
				</p>

				<br />
			</div>
			<div class="three columns marginTop contactDetails">
				<p class="contactTime">
					Mon-Fri: 8:30am &rarr; 4:30pm <br /> The Library will be closed on
					week-ends & all public holidays including Poya Days.
				</p>
			</div>



			<div id="contact_form">
				<div class="two-thirds column marginTop formWrap">
					<form action="#" method="post" class="contactForm">
						<div class="formSecWrap">
							<label for="form_name">Name</label> <input type="text"
								id="form_name" name="form_name" value="" /> <label
								for="form_email">Email</label> <input type="text"
								name="form_email" id="form_email" value="" /> <label
								for="form_subject">Subject</label> <input type="text"
								name="form_subject" id="form_subject" value="" />
						</div>
						<div class="formSecWrap formSecWrap2">
							<label for="form_message">Message</label>
							<textarea class="textarea" name="form_message" id="form_message"></textarea>

							<input class="button" id="submit-form" type="submit"
								name="submit" value="Send Message"
								style="background-color: #7b133c;" />
						</div>
						<div id="success"></div>
					</form>
				</div>
			</div>
		</div>


		<!--start parallax 5-->
		<div id="parallax-5" class="parallax fixed"
			style="background-image: url(images/parallax-5.jpg);">
			<div class="quoteWrap">
				<div class="quote">
					<div class="container">
						<div class="sixteen columns">
							<h3>
								<span class="large">Books are </span> <span class="largeBold">uniquely
								</span> <br> <span class="medium">Portable</span><span
									class="mediumBold"> magic.</span> <br>
								<span class="author">Stephen King</span>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--end parallax 5-->

	</div>
	<!--end contact-->

	<!--start portfolio -->
	<div id="folio" class="page section">
		<div class="container">

			<div class="row">
				<div class="span5">

					<form method="post" action="LoginController" class="login">

						<h4>
							<img alt="" src="img/books.png">Library Management System
						</h4>

						<label for="username">Username</label> <input
							style="margin: 0 0 5%;" type="text" name="username"
							placeholder="Your Username" /> <label for="password">Password</label>

						<input style="margin: 0 0 5%;" type="password" name="password"
							placeholder="Your Password" />
						<!-- Clearn both sides -->
						<div class="clear"></div>
						<a href="forgotusername.jsp">Forgot Username</a> <input
							type="submit" value="submit">



					</form>

				</div>

			</div>
		</div>


	</div>
	<!--end portfolio-->


	<!--start footer-->
	<div id="footer">

		<div class="container">


			<div class="sixteen columns">
				<p class="copyright">&copy; Ceylon Electricity Board 2014.</p>
			</div>
		</div>
	</div>
	<!--end footer-->

	<script type="text/javascript">
	function moveTo(contentArea){
		var goPosition = $(contentArea).offset().top;
		$('html,body').animate({ scrollTop: goPosition}, 'slow');
	}
</script>

	<script type="text/javascript">
	  $('#carouselSlider').flexslider({
		animation: "slide",
		animationLoop: true,
		itemWidth: 237,
		itemMargin: 2,
		start: function(slider){
		  $('body').removeClass('loading');
		}
	  });
</script>

	<script type="text/javascript" charset="utf-8">
	$(document).ready(function(){
		
		$("a[rel^='prettyPhoto']").prettyPhoto({animation_speed:'normal',slideshow:6000});
		$(".contactDetails a[rel^='prettyPhoto']:first").prettyPhoto({
			custom_markup: '<div id="map_canvas" style="width:500px; height:500px"></div>',
			changepicturecallback: function(){ initialize(); }
		});
	});
</script>



</body>
</html>
