package com.springboot.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the exam database table.
 * 
 */
@Entity
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exam_id")
	private int examId;


	@Lob
	@Column(name="exam_name")
	private String examName;
	
	@Lob
	@Column(name="exam_description")
	private String examDescription;

	@Column(name="number_of_examinees")
	private int numberOfExaminees;

	@Column(name="passing_rate")
	private double passingRate;

	
	
	public Exam() {
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	public void setExamDescription(String Description){
		this.examDescription = Description;
	}
	
	public String getExamDescription(){
		return this.examDescription;
	}

	public String getExamName() {
		return this.examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public int getNumberOfExaminees() {
		return this.numberOfExaminees;
	}

	public void setNumberOfExaminees(int numberOfExaminees) {
		this.numberOfExaminees = numberOfExaminees;
	}

	public double getPassingRate() {
		return this.passingRate;
	}

	public void setPassingRate(double passingRate) {
		this.passingRate = passingRate;
	}

}