<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
 		<script type="text/javascript" src=""></script>
			
		<title>Survey Submission</title>
	</head>
	
	<body>
		<div class="container mx-auto text-center">
	        <h3>Submitted Info</h3>
	        
	        <form class = "mx-auto text-left">
  		        <div class = "form-group row">
		        	<label class = "col-md-6 col-form-label">Name:</label>
	        		<label class = "col-md-6 col-form-label " ><c:out value="${name}"/></label>	
		        </div>
  		        <div class = "form-group row">
		        	<label class = "col-md-6 col-form-label">Dojo:</label>
	        		<label class = "col-md-6 col-form-label" ><c:out value="${location}"/></label>	
		        </div>
  		        <div class = "form-group row">
		        	<label class = "col-md-6 col-form-label">Favorite Language:</label>
	        		<label class = "col-md-6 col-form-label" ><c:out value="${language}"/></label>	
		        </div>
  		        <div class = "form-group row">
		        	<label class = "col-md-6 col-form-label">Comment:</label>
	        		<label class = "col-md-6 col-form-label"><c:out value="${comment}"/></label>	
		        </div>		        

	        </form>

	        
	    	<a href="/" class="btn btn-primary">Go back</a>
		</div>
	</body>
</html>