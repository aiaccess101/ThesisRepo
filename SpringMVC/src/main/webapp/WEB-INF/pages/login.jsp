<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Login </title>
		<link  rel="stylesheet" type="text/css" href="/css/login.css">
	</head>
	<body>
		<div id="header-section">
				<button id="home-button">Home</button>
		</div>
		<div id="login-container">
			<div id="first-container">
				<br>LOGIN TO YOUR ACCOUNT<br>
			</div>
			<div id="second-container">
				<form action="http://localhost:8080/login/verify" method="post" >
			 		<div class="login-username" >
						<label>Username</label> 
						<input type="text" name="txtUsername" value="" required>
					</div>

				 	<div class="login-password">
						<label>Password</label> 
						<input type="Password" name="txtPassword" value="" required>
					</div><br>
				
					<button id="login-button" type="submit">Sign in</button>
				</form>
			</div>
		</div>
	</body>
</html>