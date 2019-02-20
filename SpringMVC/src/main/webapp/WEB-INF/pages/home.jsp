<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Examination Prediction System </title>
		<link rel="stylesheet" type="text/css" href="/css/home.css">
	</head>
	<body>
		<div id="header-section">
			<form action="http://localhost:8080/login" >
				<button id="login-button">Login</button>
			</form>
		</div>

		<div id="first-section">
			<h2>ABOUT</h2>
			<p id="project-description"><br>This system will predict the passing rate of students and 
				hopefully give an appropriate topic based on the students answers.<br><br>
			These user interfaces are not yet final so this may change later in the development stage.</p>
		</div>

		<div id="second-section">
			<h1>Examination Passing Prediction System and Topic Recommendation System</h1>
			<form action="http://localhost:8080/select-exam" method="get">
				<button id="take-exam-button">Take an Exam!</button>
			</form>
		</div>

	</body>
</html>