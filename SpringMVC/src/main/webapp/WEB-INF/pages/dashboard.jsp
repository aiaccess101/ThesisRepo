<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Dashboard </title>
		<link rel="stylesheet" type="text/css" href="/css/dashboard.css">
	</head>
	<body>
		<div id="header-section">
			<img id="profile-picture" src="../background/profile.png">
			<label id="admin-label">Admin</label>
			<form action="http://localhost:8080/login">
				<button id="logout-button">Logout</button>
			</form>
		</div>

		<div id="navigation-pane">
			<img id="app-logo" src="../images/cit.png" alt="CITU LOGO">
			<button id="top-navigation-button" class="navigation-buttons">Statistics</button>
			<button class="navigation-buttons">Create an Exam</button>
			<button class="navigation-buttons">View Exams</button>
			<button class="navigation-buttons">To be Decided</button>
			<button class="navigation-buttons">To be Decided</button><br><br>
		</div>

		<div id="data-container">
			<div class="statistics-container">
				<p></p>
				<label class="exam-label">2017 Licensure Examination</label>
				<p class="pass-label">Pass</p>
				<p class="fail-label">Fail</p>
				<div class="bar-graph"><p><br></p>
					<div id="bar-pass1" class="pass-fail-bar"><p class="bar-percentage">54%</p></div>
					<div id="bar-fail1" class="pass-fail-bar"><p class="bar-percentage">46%</p></div>
				</div>
				<p class="number-of-respondents">Based on 500 students who took the exam.</p>
			</div>
			<div class="spacing"></div>

			<div class="statistics-container">
				<label class="exam-label">2018 Mock Board Examination</label>
				<p class="pass-label">Pass</p>
				<p class="fail-label">Fail</p>
				<div class="bar-graph"><p><br></p>
					<div id="bar-pass2" class="pass-fail-bar"><p class="bar-percentage">39%</p></div>
					<div id="bar-fail2" class="pass-fail-bar"><p class="bar-percentage">61%</p></div>
				</div>
				<p class="number-of-respondents">Based on 1000 students who took the exam.</p>
			</div>
			<div class="spacing"></div>

			<div class="statistics-container">
				<label class="exam-label">2015 Sample Examination</label>
				<p class="pass-label">Pass</p>
				<p class="fail-label">Fail</p>
				<div class="bar-graph"><p><br></p>
					<div id="bar-pass3" class="pass-fail-bar"><p class="bar-percentage">78%</p></div>
					<div id="bar-fail3" class="pass-fail-bar"><p class="bar-percentage">22%</p></div>
				</div>
				<p class="number-of-respondents">Based on 200 students who took the exam.</p>
			</div>
		
		</div>

		<script type="text/javascript">
    		document.getElementById("logout-button").onclick = function () {
        	location.href = "../html/home.html";
    	};
		</script>

		<script type="text/javascript">
			document.getElementById("top-navigation-button").onclick = function(){
				document.getElementById("navigation-pane").width = 20px;
		};
		</script>
	</body>
</html>