package com.springboot.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_key")
	private int studentKey;

	@Lob
	@Column(name="student_id")
	private String studentId;
	
	@Lob
	@Column(name="student_course")
	private String studentCourse;

	@Lob
	@Column(name="student_name")
	private String studentName;

	@Column(name="student_year")
	private String studentYear;

	
	public Student() {
	}

	public int getStudentKey() {
		return this.studentKey;
	}

	public void setStudentKey(int studentId) {
		this.studentKey = studentId;
	}

	public String getStudentCourse() {
		return this.studentCourse;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentId() {
		return this.studentId;
	}

	
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentYear() {
		return this.studentYear;
	}

	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}


	
}