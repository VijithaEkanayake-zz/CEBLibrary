<%@ include file="header.jsp" %>

<div class="content">

	<a href="StandardController?action=insert">
		<div class="cbp-mc-column">
			<input class="cbp-mc-submit" type="submit" value="Add Standards">
		</div>
	</a> <a href="standards/search.jsp"><div class="cbp-mc-column">
			<input class="cbp-mc-submit" type="submit" value="Search Standards"
				name="search_button" onclick="standards/search.jsp">
		</div></a> <a class="logout" href="StandardController?action=liststandards"><i
		class="icon-signout"></i>
	<div class="cbp-mc-column">
			<input class="cbp-mc-submit" type="submit" value="List All Standards"
				name="search_button"
				onclick="StandardController?action=liststandards">
		</div></a>


</div>