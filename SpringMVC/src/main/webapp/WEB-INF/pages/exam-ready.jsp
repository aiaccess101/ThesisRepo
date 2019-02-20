<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Good to Go! </title>
		<link rel="stylesheet" type="text/css" href="/css/exam-ready.css">
	</head>
	<body>
		<div id="header-section">
			 
		</div>

		<div id="container">
			<form action="http://localhost:8080/exam" method="get">
				<img src="../background/check.png">
				<p>You're good to go<br>and good luck on your exam!</p><br>
				<input type="text" name="examId" value = ${examId } readonly hidden></input>
				<button id="proceed-button">Proceed</button>
			</form>
		</div>

    	</script>
	</body>
</html>