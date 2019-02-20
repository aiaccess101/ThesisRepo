package com.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.entities.Exam;
import com.springboot.service.ExamService;

@Controller

public class SelectExamController {
	
	@Autowired
	private ExamService examService;
	
	@RequestMapping(value = "select-exam", method = RequestMethod.GET)
	public String loadSelectExamPage(HttpServletRequest request, ModelMap map){
		List<Exam> exams = examService.getAllExams();
		map.addAttribute("all_exams", exams);
		return "select-exam";
	}

	
	
	

	
	
	
}
