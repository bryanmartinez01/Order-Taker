<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-3.3.1.min.js"></script>
<script>
	var contextPath = "/OrderTaker"
</script>
</head>
<body>
	<h3>Login</h3>
	<input type="text" id="userId" placeholder="Username">
	<input type="password" id="password" placeholder="Password">
	<p class="sysMessage" style="color: red"></p>
	<input type="button" id="loginBtn" value="Login">
	<p>
		Forgot password? Click <a id="forgotPass" href="">here.</a>
	</p>
</body>
<script>
	$("#loginBtn").click(function() {
		$.ajax({
			url : contextPath + "/login",
			method : "GET",
			data : {
				userId : $("#userId").val(),
				password : $("#password").val()
			},
			success : function(result) {
				sonsole.log('${logStat}');
				alert('${logStat}');
				if ("${logStat}".trim() == "success") {
					window.location.assign(contextPath + "/pages/home.jsp");
				} else {
					alert("mali");
					$(".sysMessage").html("Invalid username or password!");
				}
			}
		});
	});
</script>
</html>