<%@ include file="headerstandards.jsp"%>

<div class="content">


		<form action="StandardSearchController" method="post" class="cbp-mc-form">
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