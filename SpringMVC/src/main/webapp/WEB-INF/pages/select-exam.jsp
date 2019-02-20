<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Examination Time </title>
		<link rel="stylesheet" type="text/css" href="/css/select-exam.css">
	</head>
	<body>
		<div id="header-section">
			<button id="login-button">Login</button>
			<button id="home-button">Home</button>
		</div>

		
		<div id="exams-container">
			<c:forEach items="${all_exams}" var="exam">   
				<form action="http://localhost:8080/enter-student-details" type="submit">
					<input type="text" name="examId" value = ${exam.examId } readonly hidden></input>
			        <button id="exam_id_btn" class="exam-labels" >${exam.examName}</button>
			         <p>${exam.examDescription}</p>
	        	</form>
	        	<div class="line-break"></div>
	        </c:forEach>
        </div>
		
		

	</body>
</html>