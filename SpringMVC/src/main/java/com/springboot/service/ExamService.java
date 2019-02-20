package com.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Exam;
import com.springboot.repository.custom.ExamRepository;

@Service("examService")
public class ExamService {
	
	@Autowired
	private ExamRepository examRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Exam> getAllExams(){
		List<Exam> all_exams = examRepository.getAllExams(em);
		
		return all_exams;
	}
	
	public boolean RegisterExam(int studentKey, int examId){
		boolean flag = examRepository.registerExam(em, examId, studentKey);
		return flag;
	}

}
