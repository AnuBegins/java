<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<script type="text/javascript" src=""></script>
			
		<title>Current Visit Count</title>
	</head>
	<body>
		<div class="container">
			<div class = "pt-md-5 pb-md-4 mx-auto text-center">
				<h2>You have visited <a class="text-sm" href="/">http://localhost:8080/ </a>  <span class="text-danger"><c:out value="${count}"/></span> time(s).</h2>
				<h4><a href="/">Visit again?</a></h4>
				<h4><a href="reset">Reset visits</a></h4>
				<h4><a href="countertwo">Click here to add two more visits</a></h4>
				
			</div>

		
		</div>

	</body>
</html>