<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!-- 		<link rel="stylesheet" type="text/css" href="css/style.css">
 -->		<script type="text/javascript" src=""></script>
			
		<title>Dojo Survey Index</title>
	</head>
	
	<body>
		<div class="container mx-auto text-center">
        	<h3>Dojo Survey</h3>
        	
	        <form action = "process" method = "POST">
	            <div class = "form-group">
	                <label for = "name" class="col-form-label">Your Name</label>
	                <input type = "text" class="form-control" placeholder = "First and Last Name" name = "name">
	            </div>
	            
	            <div class = "form-group">
	                <label for = "location" class="col-form-label">Dojo Location</label>
	                <select class="form-control" name="location">
	                    <option value = "San Jose">San Jose</option>
	                    <option value = "Austin">Austin</option>
	                    <option value = "Seattle">Seattle</option>
	                    <option value = "Omaha">Omaha</option>
	                    <option value = "Los Angeles">Los Angeles</option>
	                    <option value = "Chicago">Chicago</option>
	                </select>
   	            </div>
	            
	            <div class="form-group">
	                <label for="language">Favorite Language</label>
	                <select class="form-control" name="language">
	                    <option value = "Python">Python</option>
	                    <option value = "Swift">Swift</option>
	                    <option value = "C#">C#</option>
	                    <option value = "JavaScript">JavaScript</option>
	                    <option value = "Java">Java</option>
	                </select>
	            </div>
	            
	            <div class="form-group">
	                <label for="comment">Comments (optional)</label>
	                <textarea class="form-control" rows="3" name="comment"></textarea>
	            </div>
	            
	            <button class="btn btn-primary" type="submit" value="submit">Submit</button>
	        </form>
		</div>
	</body>
	
</html>