package com.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.entities.QuestionsAndAnswer;
import com.springboot.service.QuestionsAndAnswersService;

@Controller

public class ExamController {
	
	@Autowired
	private QuestionsAndAnswersService QandAService;
	
	@RequestMapping(value = "exam", method = RequestMethod.GET)
	public String LoadExamQuestions(HttpServletRequest request, ModelMap map){
		
/*		String image = request.getPathInfo().substring(1);
		byte[] image_bytes = image.getBytes();*/
		
		int examId = Integer.parseInt(request.getParameter("examId"));
		System.out.println("EXAM ID : " + String.valueOf(examId));
		
		List<QuestionsAndAnswer> questions = QandAService.getAllQuestionsByExamId(examId);
		map.addAttribute("exam_questions",questions);
		return "exam";	
	}
	
	@RequestMapping(value = "finished-exam", method = RequestMethod.GET)
	public String InitializeFinishedExamPage(){
		System.out.print(" FINISHED EXAM ");
		return "finished-exam";
	}
}
