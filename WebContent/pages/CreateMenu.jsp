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

<title>Create Menu</title>
</head>
<body>
	<select id="createMenuDropdown">
		<option value="all">All Dishes</option>
		<option value="mon">Monday</option>
		<option value="tue">Tuesday</option>
		<option value="wed">Wednesday</option>
		<option value="thu">Thursday</option>
		<option value="fri">Friday</option>
	</select>
	<br />
	<br />
	<div id="menuContainer"></div>
</body>
<script>
	$(document).ready(function() {
		loadDishes($('#createMenuDropdown').val());
	});

	$('#createMenuDropdown').change(function() {
		createMenuDropdownChange();
	});
</script>
</html>