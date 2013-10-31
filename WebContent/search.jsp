<%@ include file="admin/header.jsp" %>

<div class="content">

<ul class="searchnav">
	
		
	
	<li class="search">
		<form action="" method="post">
			<input type="text" name="search_text" class="search_text" placeholder="Search"/>
			<input type="button" name="search_button" class="search_button">
			
			<select name="criteria">
			<option value="-1">Select a Criteria</option>
			<option value="title">Search by Title</option>
			<option value="isbn">Search by ISBN</option>
			<option value="author">Search by Author</option>
			<option value="keyword">Search by Keyword</option>
		</select>
			
		</form>
	</li>
</ul>



</div>


</body>
</html>