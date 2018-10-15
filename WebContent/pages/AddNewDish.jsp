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

<title>Add New Dish</title>
</head>
<body>
	<fieldset style="max-width: 30%;">
		<legend>Add New Dish</legend>
		<span>Dish Name:&nbsp;</span><input type="text" id="newDishNameTxt" /><span id="newDishCodeLabel" style="float: right;"></span>
		<br />
		<br />
		<span>Dish Price:&nbsp;</span><input type="number" id="newDishPriceNumber" />
		<br />
		<br />
		<span>Dish Availability:&nbsp;</span>
		<select id="newDishAvailabilityDropdown">
			<option value="M">Monday</option>
			<option value="T">Tuesday</option>
			<option value="W">Wednesday</option>
			<option value="Th">Thursday</option>
			<option value="F">Friday</option>
		</select>
		<br />
		<br />
		<input type="file" id="newDishPicUpload" placeholder="Dish Picture" accept=".png, .jpg, .jpeg" />
		<br />
		<br />
		<span>Dish Description:&nbsp;</span>
		<textarea id="newDishDescTxtArea" cols="60" rows="8"></textarea>
	</fieldset>
</body>
<script>
	$('#newDishNameTxt').keyup(function() {
		generateNewDishCode();
	});
</script>
</html>