<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
			integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
			crossorigin="anonymous">
	
		<script type="text/javascript" src=""></script>
	
		<title>Ninja Gold</title>
	</head>

	<body>
		<div class="container mx-auto text-center">
	
			<div class="pt-md-5 pb-md-4 mx-auto text-center">
				<h1 class="display-5">
					Ninja's gold count: <span class="text-warning"><c:out value = "${moneyTotal}"/></span>
				</h1>
				<p class="lead">This greedy ninja raids different places to either scavenge or wager for gold.</p>
			</div>
			
			<div class="card-deck mb-3 text-center">			
				<!-- ****** Creating a bootstrap card component for each location -->
				
<!---------------------- GROW-OP ----------------------------------------->				
				<div class="card mb-4 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Grow-Op</h4>
					</div>
					<p>+ [10,20] coins</p>
					<form action="/process/1" method="POST" class="form-control">
						<input type="hidden" name="getCoin" value='Grow-Op'>
						<input type="submit"  class="btn btn-sm btn-secondary" value="Find Gold!">
					</form>
				</div>

<!---------------------- BORDELLO ----------------------------------------->				
				<div class="card mb-4 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Bordello</h4>
					</div>
					<p>+ [5,10] coins</p>
					<form action="/process/2" method="POST" class="form-control">
						<input type="hidden" name="getCoin" value='Bordello'>
						<input type="submit" class="btn btn-sm btn-secondary" value="Find Gold!">
					</form>
				</div>
				
<!---------------------- DOJO----------------------------------------->				
				<div class="card mb-4 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Dojo</h4>
					</div>
					<p>+ [2,5] coins</p>
					<form action="/process/3" method="POST" class="form-control">
						<input type="hidden" name="getCoin" value='Dojo'>
						<input type="submit" class="btn btn-sm btn-secondary" value="Find Gold!">
					</form>
				</div>
				
<!---------------------- CASINO ----------------------------------------->				
				<div class="card mb-4 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Ca$ino</h4>
					</div>
					<p>+/- [0,50] coins</p>
					<form action="/process/4" method="POST" class="form-control">
						<input type="hidden" name="getCoin" value='Ca$ino'>
						<input type="submit" class="btn btn-sm btn-secondary" value="Find Gold!">
					</form>
				</div>
				
				
<!---------------------- SPA----------------------------------------->				
				<div class="card mb-4 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Spa</h4>
					</div>
					<p>- [5,20] coins</p>
					<form action="/process/5" method="POST" class="form-control">
						<input type="hidden" name="getCoin" value='Spa'>
						<input type="submit" class="btn btn-sm btn-secondary" value="Spend gold">
					</form>
				</div>				
				
				
			</div>

<!-------------------------- RESET -------------------------------------->
			<div class="form-group">
				<form action = "/reset" method = "POST">
					<br>
					<input type = "submit" class = "btn btn-primary" value = "Reset">
				</form>
			</div>
	
<!--------------------------Activity Summary-------------------------- -->
			<h3>Activity:</h3>
			<div class = "text-center border border-default">
   				<c:forEach items = "${activities}" var = "status">
   					<p><c:out value = "${status}"/></p>
   				</c:forEach>
  			</div>
			

		</div>
	</body>
</html>