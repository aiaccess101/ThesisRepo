<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title> Examination Time </title>
		<link rel="stylesheet" type="text/css" href="../css/exam.css">
	</head>
	<body>
		<div id="header-section">
			<img id="profile-picture" src="../background/profile.png">
			<label id="profile-label">Jess S. Ferrancullo</label>
		</div>

		<div id="exams-container">
			<form action="http://localhost:8080/finished-exam" method="get" >
				<c:forEach items="${exam_questions}" var="exam">   
					<h3>${exam.questionsAndAnswersQuestion }</h3>
					<table>
						<tr>
						 	<td><label><input type="radio" name=${exam.questionsAndAnswersNumber } value="A">${exam.questionsAndAnswersChoiceA }</label></td>
							<td><label><input type="radio" name=${exam.questionsAndAnswersNumber } value="B">${exam.questionsAndAnswersChoiceB }</label></td>
						</tr>
						<tr>
							<td><label><input type="radio" name=${exam.questionsAndAnswersNumber } value="C">${exam.questionsAndAnswersChoiceC }</label></td>
							<td><label><input type="radio" name=${exam.questionsAndAnswersNumber } value="D">${exam.questionsAndAnswersChoiceD }</label></td>
						</tr>
					</table>
		
					<div class="line-break"></div>
				</c:forEach>
				<button id="btn-pass-exam">Submit</button>
			</form>
		</div>

	</body>
</html>