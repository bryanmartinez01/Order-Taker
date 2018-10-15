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

<title>Menu</title>
</head>
<body>

	<input type="button" id="createMenuBtn" value="Create Menu" />
	<br />
	<br />
	<input type="button" id="manageDishesBtn" value="Manage Dishes" />
	<br />
	<br />
	<input type="button" id="addNewDishBtn" value="Add New Dish" />

</body>
<script>
	$('#createMenuBtn').click(function() {
		window.location.assign(contextPath + "/pages/CreateMenu.jsp");
	});
	
	$('#manageDishesBtn').click(function() {
		window.location.assign(contextPath + "/pages/ManageDishes.jsp");
	});
	
	$('#addNewDishBtn').click(function() {
		window.location.assign(contextPath + "/pages/AddNewDish.jsp");
	});
</script>
</html>