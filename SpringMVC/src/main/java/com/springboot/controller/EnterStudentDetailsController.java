package com.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.service.ExamService;
import com.springboot.service.StudentService;

@Controller

public class EnterStudentDetailsController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ExamService examService;
	
	
	@RequestMapping("enter-student-details")
	public String loadEnterStudentDetails(HttpServletRequest request, ModelMap map){
		int examId = Integer.parseInt(request.getParameter("examId"));
		System.out.print(String.valueOf(examId));
		map.addAttribute("examId",examId);
		return "enter-student-details";
	}
	
	@RequestMapping(value="enter-student-details/verify",method = RequestMethod.POST)
	public String GotoEnterStudentDetails(HttpServletRequest request, ModelMap map){
		
		String name = request.getParameter("txtStudentName");
		String id = request.getParameter("txtStudentId");
		String year = request.getParameter("txtStudentYear");
		String course = request.getParameter("txtStudentCourse");
		
		int examId = Integer.parseInt(request.getParameter("examId"));
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(course);
		System.out.println(year);
		System.out.println(String.valueOf(examId));
		
		int studentKey = studentService.addStudent(id, name, course, year);
		
		examService.RegisterExam(studentKey, examId);
		map.addAttribute("examId",examId);
		return "exam-ready";
	}
	
}
