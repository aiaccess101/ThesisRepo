package com.springboot.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Student;
import com.springboot.repository.custom.StudentRepository;

@Service("studentService")
public class StudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	public int addStudent(String id, String name, String course, String year){
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentName(name);
		student.setStudentCourse(course);
		student.setStudentYear(year);
		
		int student_key = studentRepository.addStudent(em, student);
		return student_key;
	}
	
	public Student getStudentById(int studentId){
		Student student = studentRepository.getStudentById(em, studentId);
		return student;
	}
}
