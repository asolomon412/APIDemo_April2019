<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>API Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />


</head>
<body>
	<div class="container">${quotetest.type } <br>
	${quotetest.value.quote}<br>
	
	<a class="btn btn-primary" href="/">Generate Random Quote</a>
	<br><br>
	
	<form action="love">
	First Name: <input type="text" name="fname">
	Second Name: <input type="text" name="sname">
	<input type="submit" value="Match!">
	</form>
	
	
	</div>
</body>
</html>