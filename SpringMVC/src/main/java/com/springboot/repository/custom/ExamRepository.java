package com.springboot.repository.custom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.entities.Exam;
import com.springboot.entities.ExamRegistration;
import com.springboot.entities.Student;

@Repository
@Transactional
public class ExamRepository {

	public boolean addExam(EntityManager em, Exam exam){
		em.persist(exam);
		return false;
	}
	
	public boolean registerExam(EntityManager em, int examId, int studentKey){
		
		ExamRegistration er = new ExamRegistration();
		
		er.setExamId(examId);
		er.setStudentId(studentKey);
		er.setExamScore(0);
		er.setStudentWeakness("");
		
		em.persist(er);
		return false;
	}
	
	public ExamRegistration getExamEvalationbyStudentId(EntityManager em, int studentId){
		ExamRegistration registration = null;
		StringBuilder builder = new StringBuilder ("FROM ExamRegistration WHERE studentId = :student_id ");
		Query query = em.createQuery(builder.toString());
		query.setParameter("student_id", studentId);
		registration = (ExamRegistration)query.getSingleResult();
		return registration;
	}
	
	public List<Exam> getAllExams(EntityManager em){
		StringBuilder builder = new StringBuilder("FROM Exam");
		Query query = em.createQuery(builder.toString());
		List<Exam> exams= query.getResultList();
		return exams;
	}
	
}
