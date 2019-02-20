package com.springboot.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the exam_registration database table.
 * 
 */
@Entity
@Table(name="exam_registration")
public class ExamRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exam_registration_id")
	private int examRegistrationId;
	
	@Column(name="exam_score")
	private int examScore;

	@Lob
	@Column(name="student_weakness")
	private String studentWeakness;

	@Column(name="exam_id")
	private int examId;

	@Column(name="student_key")
	private int studentKey;

	public ExamRegistration() {
	}

	public int getExamScore() {
		return this.examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}

	public String getStudentWeakness() {
		return this.studentWeakness;
	}

	public void setStudentWeakness(String studentWeakness) {
		this.studentWeakness = studentWeakness;
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examid) {
		this.examId = examid;
	}

	public int getStudentKey() {
		return this.studentKey;
	}

	public void setStudentId(int studentid) {
		this.studentKey = studentid;
	}

}