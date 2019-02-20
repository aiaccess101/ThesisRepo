package com.springboot.repository.custom;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.entities.Student;

@Repository
@Transactional
public class StudentRepository {

	public int addStudent(EntityManager em,Student student){
		em.persist(student);
		int student_key = 0;
		StringBuilder builder = new StringBuilder ("SELECT studentKey FROM Student WHERE studentId LIKE :student_id");
		Query query = em.createQuery(builder.toString());
		query.setParameter("student_id", student.getStudentId());
		student_key = (int) query.getSingleResult();
		return student_key;
	}
	
	public Student getStudentById(EntityManager em, int studentId){
		Student student = null;
		StringBuilder builder = new StringBuilder ("FROM Student WHERE studentId LIKE :student_id ");
		Query query = em.createQuery(builder.toString());
		query.setParameter("student_id", studentId);
		student = (Student)query.getSingleResult();
		return student;
	}
	
	
	
	
}
