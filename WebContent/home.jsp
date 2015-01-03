<%@ include file="headerlogo.jsp"%>

<div class="content">



<form class="cbp-mc-form" name="setCriteria" method="POST"
			action='CategoryController'>
			
	
	<div style="position: relative; margin: 30px 0px;">
		<p style="color:red;text-align: left;margin-left: 30px; font-size:18px;">Please select the appropriate material category and click proceed to continue.</p>
	</div>
		
		<div class="cbp-mc-column">	
			<select name="selection">
			<option value="-1">Select a Category</option>
			<option value="b">Books</option>
			<option value="s">Standards</option>
			<option value="p">Periodicals</option>
			<option value="r">Reports</option>
			<option value="t">Thesis</option>
		
		</select>
		</div>
		<div class="cbp-mc-column">
			<input class="cbp-mc-submit" type="submit" value="Proceed">
		</div>
	
</form>

</div>