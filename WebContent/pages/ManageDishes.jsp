<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../js/menu.js"></script>

<script>
	var contextPath = "${pageContext.request.contextPath}";
</script>

<title>Manage Dishes</title>
</head>
<body>
	<input type="text" id="dishNameTxt" placeholder="Dish Name" disabled/>
	<input type="text" id="dishPriceTxt" placeholder="Dish Price" disabled/>
	<select id="dishAvailabilityDropdown" disabled>
		<option value="" selected disabled hidden="hidden">-- Select --</option>
		<option value="M">Monday</option>
		<option value="T">Tuesday</option>
		<option value="W">Wednesday</option>
		<option value="Th">Thursday</option>
		<option value="F">Friday</option>
	</select>
	<br />
	<br />
	<textarea id="dishDescTxtArea" rows="3" cols="50"
		placeholder="Dish Description" disabled></textarea>
	<div id="menuContainer"></div>
</body>
<script>
	calledFromManageDishes = true;
	
	$(document).ready(function() {
		loadDishes('all');
	});
</script>
</html>