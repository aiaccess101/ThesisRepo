package com.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.QuestionsAndAnswer;
import com.springboot.repository.custom.QuestionsAndAnswersRepository;

@Service
public class QuestionsAndAnswersService {

	@PersistenceContext
	private EntityManager em;
	
	
	@Autowired
	private QuestionsAndAnswersRepository questionsAndAnswersRepository;
	
	public List<QuestionsAndAnswer> getAllQuestionsByExamId(int examId){
		List<QuestionsAndAnswer> all_questions = questionsAndAnswersRepository.getAllQuestionsByExamId(em, examId);
		return all_questions;
	}
	
	public boolean insertQuestions(List<QuestionsAndAnswer> questionnaire){
		boolean flag = false;
		questionsAndAnswersRepository.addQuestionsAndAnswer(em,questionnaire);
		return flag;
	}
}
