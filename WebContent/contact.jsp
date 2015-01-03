<!doctype html>
<!--[if IE 7]>    <html class="ie7" > <![endif]-->
<!--[if IE 8]>    <html class="ie8" > <![endif]-->
<!--[if IE 9]>    <html class="ie9" > <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en-US"> <!--<![endif]-->
		<head>				
				<!-- META TAGS -->
				<meta charset="UTF-8" />
				<meta name="viewport" content="width=device-width" />
				
				<!-- Title -->
				<title>CEB Library System</title>
              
                <!-- FAVICON -->
                <link rel="shortcut icon" href="images/favicon.png" />
				
                
                <!-- Style Sheet-->
				<link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,800,700,300' rel='stylesheet' type='text/css'>
				<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>                  
                <link rel="stylesheet" href="js/prettyPhoto/css/prettyPhoto.css"/>
                <link rel="stylesheet" href="js/flexslider/flexslider.css"/>                
                <link rel="stylesheet" href="css/jquery.ui.all.css"/>                
                <link rel="stylesheet" href="css/jquery.ui.theme.css"/> 
				<link rel="stylesheet" href="style.css"/>
                <link rel="stylesheet" href="css/media-queries.css"/>                    
                <link rel="stylesheet" href="css/custom.css"/>                     
                
                <!-- Pingback URL -->
                <link rel="pingback" href="http://healthpress.inspirythemes.com/xmlrpc.php" />

                <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
                <!--[if lt IE 9]>
                    <script src="js/html5.js"></script>
                <![endif]-->
				
		</head>
        
        <body>				
        
				<!-- Starting Website Wrapper -->
                <div id="wrapper">
                		
                        <!-- Starting Header of the website -->
                        <header id="header">

                                <!-- Website Logo Place -->
                                <div id="logo-container">
                                    <a href="index.jsp" class="logo"  title="Site Logo">
                                        <img src="images/logo.png" alt="Health Press">
                                    </a>
                                </div>
                                                             
                                <ul class="social-nav">                                        
                                    <li class="facebook"><a target="_blank" href="#"></a></li>
                                    <li class="twitter"><a target="_blank" href="#"></a></li>
                                    <li class="skype"><a target="_blank" href="#"></a></li>																	
                                    <li class="flickr"><a target="_blank" href="#"></a></li>																	
                                    <li class="google"><a target="_blank" href="#"></a></li>																
                                    <li class="linkedin"><a target="_blank" href="#"></a></li>															
                                    <li class="rss"><a target="_blank" href="#"></a></li>
                                    <li class="phone"><span>1.800.123.4567</span></li>
                                </ul>                           
								
                                
                                <nav class="main-nav clearfix">

                                		<!-- MAIN NAVIGATION -->
                                        <div class="menu-div">
                                        	<ul>
                                            	<li>
                                                	<a href="index.jsp">Home</a>
                                                </li>
                                                <li>
                                                	<a href="about.jsp">About Us</a>
                                                </li>
                                                <li>
                                                	<a href="services.jsp">Services</a>
                                                </li>
                                                <li>
                                                	<a href="resources.jsp">Resources</a>
                                                </li>
                                                <li>
                                                	<a href="newarrivals.jsp">New Arrivals</a>
                                                </li>
                                                <li>
                                                	<a href="#">Search</a>
                                                    
                                                </li>
                                                <li>
                                                	<a href="#">Membership</a>
                                                    
                                               </li>
                                               <li><a href="contact.jsp">Contact Us</a></li>
                                            </ul>
                                        </div>
                                        
                                        <!-- GLOBAL SEARCH -->
                                        <form method="get" action="#" id="topsearch">
                                        		<p>
                                                    <input type="text" placeholder="Search" name="s" id="tsearch">
                                                    <input type="submit" id="topsubmit" value="">
                                                </p>
                                        </form>
                                </nav>
                        </header><!-- ending of header of the website -->
                        
                        
                        
                        <hgroup class="page-head">    		
                                <h2>Contact <span>Us</span></h2>
                                <h5>description<br>two columns.</h5>
                        </hgroup>
                        
                       <div id="container" class="clearfix">
								
                                <div id="content">
                                		                                                   
                                    <div class="map-container clearfix">
                                    
                                        <div id="map_canvas"></div>							
    
                                        <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
                                        <script type="text/javascript">
                                                                                
                                            function initialize() 
                                            {
                                                var geocoder  = new google.maps.Geocoder();
                                                var map;
                                                var latlng = new google.maps.LatLng(-37.817917, 144.965065);
                                                var infowindow = new google.maps.InfoWindow();
                                                var myOptions = { 
                                                  zoom: 17,
                                                  mapTypeId: google.maps.MapTypeId.ROADMAP
                                                };
                                                
                                                map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
                                                
                                                geocoder.geocode( { 'location': latlng }, 
                                                    function(results, status) {
                                                              if (status == google.maps.GeocoderStatus.OK) 
                                                              {
                                                                map.setCenter(results[0].geometry.location);
                                                                var marker = new google.maps.Marker({
                                                                    map: map, 
                                                                    position: results[0].geometry.location
                                                                });                                                                                                
                                                              } 
                                                              else 
                                                              {
                                                                alert("Geocode was not successful for the following reason: " + status);
                                                              }
                                                    });
                                              }
                                                                                     
                                              initialize();
                                              
                                        </script>     	
                                    </div>	    																                                                        
                                    
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>
                                                                                                                                                                    
                                    <address>
                                        Contact Details will be appear <br>Contact Address will be appear here,<br>City, State, Country<br>
                                    </address>
                                                                                    
                                        <div class="contact-form-container">
                                            <h3 class="smart-head">Contact Us</h3>
                                            <p>Fill out the form below to send us a message and we will get back to you ASAP.</p>
                                            <form action="http://inspirythemes.com/templates/healthpress-html/submit.php" id="contact-form" class="clearfix" method="post">
                                                <div class="form-cell">
                                                    <label class="display-ie8" >Name:</label>
                                                	<input type="text" placeholder="Name" class="name required" name="author" title="* Please provide your name"  /><span>*</span>
                                                </div>
                                                
                                                <div class="form-cell">
                                                     <label class="display-ie8" >Phone:</label>
                                                	<input type="text" placeholder="Phone No." class="phone" name="phone" />
                                                </div>
                                                
                                                <div class="form-cell">
                                                     <label class="display-ie8" >Email:</label>
                                                	<input type="text" placeholder="Email Address'" class="email required" name="email" title="* Please enter your email address" /><span>*</span>
                                                </div>
                                                
                                                <div class="form-cell">
                                                     <label class="display-ie8" >Subject:</label>
                                                	<input type="text" placeholder="Subject" class="subject" name="subject" />
                                                </div>																								
                                                
                                                <div class="form-row">
                                                     <label class="display-ie8" >Message:</label>
                                                	<textarea name="message" class="message required" cols="30" rows="10" placeholder="Message" title="* Please enter your message"></textarea>
													
													<div class="captcha-container">
														<label>Are you human?</label>
														<img src="captcha/contact_captcha.png" alt="captcha"/>
														<input type="text" class="captcha required" name="captcha" maxlength="5" title="* Please enter the code characters displayed in image!"/>
													</div>
													
                                                	<input type="submit" name="submit" value="Submit" class="submit readmore"/>
                                                    
                                                    <input type="hidden" name="action" value="send_message" />
													<input type="hidden" name="target" value="fahid@960development.com" />
													<img src="images/loading.gif" id="contact-loader" alt="Loader" />
                                                    <p id="message-sent">&nbsp;</p>

                                                </div>
                                                
                                                <div class="error-container">
                                                </div>
                                            </form>
                                        </div>									
                                </div>
                                
                               <aside id="sidebar">
                                    <section class="widget">
                                        <h3 class="title">Quick Contact</h3>        
                                        <div class="contact-widget">
                                            <p>
                                                <strong>Work :</strong> +92 - 123 - 456 - 7890<br>
                                                <strong>Cell :</strong> +92 - 1234567890<br>
                                                <strong>Fax :</strong> +92 - 123 - 456 - 7891<br>
                                            </p>
                                            <hr>
                                            <p>
                                                <a href="mailto:info@yoursite.com">info@yoursite.com</a><br>
                                                <a href="mailto:support@yoursite.com">support@yoursite.com</a>            
                                            </p>
                                        </div>        
                                    </section>
                                                                    
                                    <section class="widget">                   
                                        <div class="appointment">
                                            <div class="header">
                                                    <h2>Make an Appointment</h2>
                                                    <h3 class="number">1-800-123-4567</h3>
                                                    <span class="or">OR</span>
                                            </div>
                                            <form action="http://inspirythemes.com/templates/healthpress-html/submit.php" id="appoint-form" method="post">
                                                    <p>
                                                        <label class="display-ie8" for="apo_name">Full Name</label>
                                                        <input type="text" name="apo_name" class="required" id="apo_name" placeholder="Full Name" title="* Please enter your Full Name" />
                                                    </p>
                                                    <p>
                                                        <label class="display-ie8" for="apo_phone">Phone Number</label>
                                                        <input type="text" name="apo_phone" class="required" id="apo_phone" placeholder="Phone Number" title="* Please enter your Phone Number" />
                                                    </p>
                                                    <p>
                                                        <label class="display-ie8" for="apo_email">Email Address</label>
                                                        <input  type="text" name="apo_email"  class="email required" id="apo_email" placeholder="Email Address" title="* Please enter valide Email Address" />
                                                    </p>
                                                    <p>
                                                        <label class="display-ie8" for="apo_date">"Appointment Date</label>
                                                        <input type="text" name="apo_date" class="required" id="apo_date" placeholder="Appointment Date" title="* Please select desired appointment date" />
                                                    </p>
                                                    <p>
                                                        <label class="display-ie8" for="apo_date">Message</label>
                                                        <textarea name="message" class="message required" cols="30" rows="5" placeholder="Message" title="* Please enter your message"></textarea>
                                                    </p>
                                                    
                                                    <div class="captcha-container">
                                                        <img src="captcha/appointment_captcha.png" alt=""/>
                                                        <input type="text" class="captcha required" name="captcha" maxlength="5" title="* Please enter the code characters displayed in image!"/>
                                                    </div>
                                                    
                                                    <p>															
                                                        <input type="submit" value="Submit Request" class="readmore">
                                                        <input type="hidden" name="action" value="request_appointment" />
                                                        <input type="hidden" name="target" value="robort@psdtohtmlwp.com" />
                                                        <img src="images/loading.gif" id="apo-loader" alt="Loader" />
                                                    </p>
                                                    <p id="apo-message-sent"></p>
                                                    <div class="error-container"></div>                            
                                            </form>
                                        </div>                             
                                    </section>								
                                </aside>                               
                                                                
                                								
                                <!-- twitter update list -->
                                <ul id="twitter_update_list">
                                        <li>No Tweet Loaded !</li>
                                </ul>
                                
                                <script src="http://twitterjs.googlecode.com/svn/trunk/src/twitter.min.js" type="text/javascript"></script>
                                <script type="text/javascript">
                                    getTwitters('twitter_update_list', { 
                                          id: '960development', 
                                          count: 1,
                                          enableLinks: true, 
                                          ignoreReplies: true, 
                                          clearContents: true,
                                          template: '%text%'
                                    });
                                </script> 
																	
                        </div><!-- end of container -->
                        
                       
                                              
                       
                       <div id="footer-wrap">
                        		
                                <footer class="clearfix">
                                
										<section class="footer-widget">
                                            <section class="widget">			    
                                                <h3>
                                                    <a href="index-2.html"><img src="images/footer-logo.png" alt="HealthPress"></a>
                                                </h3>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis adipiscing id nulla vel lorem dapibus fringilla eget non felis, porttitor lectus.</p>
                                                <a href="#" class="readmore">Read more</a>
                                            </section>													
										</section>
										
										<section class="footer-widget">
                                            <section class="widget">
                                                <h3 class="title">Quick Links</h3>
                                                <div>
                                                    <ul>
                                                        <li ><a href="index-2.html">Home</a></li>
                                                        <li ><a href="blog.html">Blog</a></li>
                                                        <li ><a href="services-four-columns.html">Services</a></li>
                                                        <li ><a href="doctors-four-columns.html">Doctors</a></li>
                                                        <li ><a href="contact.html">Contact Us</a></li>                                               
                                                   </ul>
                                               </div>
                                           </section>                                      
										</section>
										
										<section class="footer-widget">
                                            <section class="widget">
                                                    <h3 class="title">Recent Posts</h3>
                                                    <div>
                                                        <ul>
                                                            <li ><a href="blog.html">Latest Health Lessons</a></li>
                                                            <li ><a href="blog.html">The Benefits of Middle-Age Fitness</a></li>
                                                            <li ><a href="blog.html">For Young Athletes, Good Reasons to Break the Fast-Food Habit</a></li>
                                                            <li ><a href="blog.html">For Weight Loss, Less Exercise May Be More</a></li>
                                                            <li ><a href="blog.html">Really?: Adding Milk to Tea Destroys its Antioxidants</a></li>                                               
                                                       </ul>
                                                   </div>
                                               </section>
										</section>
										
										<section class="footer-widget">
                                            <section class="widget">
                                            	<h3 class="title">Location</h3>   
                                                <p>Address will be appear here, some details here City Name, Stat &amp; Country.</p>
                                                <p><span>Ph:</span> +800 123 4567</p>
                                                <p><span>Email:</span> <a href="mailto:info@yoursite.com">info@yoursite.com</a></p>               
                                            </section>                                     
										</section>
									
                                </footer><!-- end of #bottom -->                                                       		                                
								
                        </div><!-- footer-wrap -->
                        
						<div id="footer-bottom-wrapper">
							<div id="footer-bottom">
									<p class="copyrights">© Copyright 2012. All Rights Reserved by HealthPress.</p>
									 
		                    </div><!-- footer-bottom -->
						</div>
                        
                </div><!-- End of Wrapper Div -->
				
                <script src="js/jquery-1.8.2.min.js"></script>
                <script src="js/prettyPhoto/js/jquery.prettyPhoto.js"></script>                
                <script src="js/jquery.validate.min.js"></script>
                <script src="js/jquery.form.js"></script>
                <script src="js/jquery.ui.core.min.js"></script>
                <script src="js/jquery.ui.datepicker.min.js"></script>
                <script src="js/jquery.cycle.lite.js"></script>
                <script src="js/jquery.easing.1.3.js"></script>
                <script src="js/flexslider/jquery.flexslider-min.js"></script>
                <script src="js/jquery.isotope.min.js"></script>
                
                <script src="js/custom.js"></script>

				<a href="#top" id="scroll-top"></a>
                	
		</body>
</html>	


