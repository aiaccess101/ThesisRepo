<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Enter your Student Details </title>
		<link rel="stylesheet" type="text/css" href="/css/enter-student-details.css">
	</head>
	<body>
		<div id="header-section">
			<form action="http://localhost:8080/login" method="post" >
				<button id="home-button">Home</button>
			</form>
		</div>
		
		<div id="student-details-container">
			<div id="first-container">
				<br>ENTER YOUR STUDENT DETAILS<br>
			</div>
			
			<div id="second-container">
				<form action="http://localhost:8080/enter-student-details/verify" method="post" accept-charset=utf-8>
					<div id="student-id"> 
						<label>Student ID</label> 
						<input type="text" name="txtStudentId" required>
					</div>
	
					<div id="student-name"> 
						<label>&nbsp &nbsp &nbsp &nbspName</label> 
						<input type="text" name="txtStudentName" required>
					</div>
	
					<div id="student-course">
						<label>&nbsp &nbsp &nbspCourse</label> 
						<input type="text" name="txtStudentCourse" required>
					</div>
	
					<div id="student-year"> 
						<label>&nbsp &nbsp &nbsp &nbsp &nbspYear</label> 
						<input type="text" name="txtStudentYear" required>
					</div>
				
					<input type="text" name="examId" value = ${examId } readonly hidden></input>
					<button id="cancel-button" onclick="history.back()">Back</button>
					<button id="submit-button" type="submit">Submit</button>
				</form>
				
					
				
			</div>

		</div>


	</body>
</html>