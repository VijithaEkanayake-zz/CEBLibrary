<%@ include file="header.jsp" %>

<div class="content">


		<form action="SearchController" method="post" class="cbp-mc-form">
		<div class="cbp-mc-column">
			<input type="text" name="search_text"  placeholder="Type Here Search"/>
		</div>
		<div class="cbp-mc-column">	
			<select name="criteria">
			<option value="-1">Select a Criteria</option>
			<option value="title">Search by Title</option>
			<option value="isbn">Search by ISBN</option>
			<option value="author">Search by Author</option>
			<option value="keyword">Search by Keyword</option>
			
		
		</select>
		
		</div>	
		
		<div class="cbp-mc-column">
			<input class="cbp-mc-submit" type="submit" name="search_button">
		</div>
		</form>




</div>


</body>
</html>