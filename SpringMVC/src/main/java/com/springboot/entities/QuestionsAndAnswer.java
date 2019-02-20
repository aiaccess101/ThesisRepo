package com.springboot.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the questions_and_answers database table.
 * 
 */
@Entity
@Table(name="questions_and_answers")
@NamedQuery(name="QuestionsAndAnswer.findAll", query="SELECT q FROM QuestionsAndAnswer q")
public class QuestionsAndAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="questions_and_answers_id")
	private int questionsAndAnswersId;

	@Column(name="questions_and_answers_answer")
	private String questionsAndAnswersAnswer;

	@Column(name="questions_and_answers_choice_a")
	private String questionsAndAnswersChoiceA;

	@Column(name="questions_and_answers_choice_b")
	private String questionsAndAnswersChoiceB;

	@Column(name="questions_and_answers_choice_c")
	private String questionsAndAnswersChoiceC;

	@Column(name="questions_and_answers_choice_d")
	private String questionsAndAnswersChoiceD;

	@Column(name="questions_and_answers_exam_id")
	private int questionsAndAnswersExamId;

	@Column(name="questions_and_answers_number")
	private int questionsAndAnswersNumber;

	@Column(name="questions_and_answers_question")
	private String questionsAndAnswersQuestion;

	public QuestionsAndAnswer() {
	}

	public int getQuestionsAndAnswersId() {
		return this.questionsAndAnswersId;
	}

	public void setQuestionsAndAnswersId(int questionsAndAnswersId) {
		this.questionsAndAnswersId = questionsAndAnswersId;
	}

	public String getQuestionsAndAnswersAnswer() {
		return this.questionsAndAnswersAnswer;
	}

	public void setQuestionsAndAnswersAnswer(String questionsAndAnswersAnswer) {
		this.questionsAndAnswersAnswer = questionsAndAnswersAnswer;
	}

	public String getQuestionsAndAnswersChoiceA() {
		return this.questionsAndAnswersChoiceA;
	}

	public void setQuestionsAndAnswersChoiceA(String questionsAndAnswersChoiceA) {
		this.questionsAndAnswersChoiceA = questionsAndAnswersChoiceA;
	}

	public String getQuestionsAndAnswersChoiceB() {
		return this.questionsAndAnswersChoiceB;
	}

	public void setQuestionsAndAnswersChoiceB(String questionsAndAnswersChoiceB) {
		this.questionsAndAnswersChoiceB = questionsAndAnswersChoiceB;
	}

	public String getQuestionsAndAnswersChoiceC() {
		return this.questionsAndAnswersChoiceC;
	}

	public void setQuestionsAndAnswersChoiceC(String questionsAndAnswersChoiceC) {
		this.questionsAndAnswersChoiceC = questionsAndAnswersChoiceC;
	}

	public String getQuestionsAndAnswersChoiceD() {
		return this.questionsAndAnswersChoiceD;
	}

	public void setQuestionsAndAnswersChoiceD(String questionsAndAnswersChoiceD) {
		this.questionsAndAnswersChoiceD = questionsAndAnswersChoiceD;
	}

	public int getQuestionsAndAnswersExamId() {
		return this.questionsAndAnswersExamId;
	}

	public void setQuestionsAndAnswersExamId(int questionsAndAnswersExamId) {
		this.questionsAndAnswersExamId = questionsAndAnswersExamId;
	}

	public int getQuestionsAndAnswersNumber() {
		return this.questionsAndAnswersNumber;
	}

	public void setQuestionsAndAnswersNumber(int questionsAndAnswersNumber) {
		this.questionsAndAnswersNumber = questionsAndAnswersNumber;
	}

	public String getQuestionsAndAnswersQuestion() {
		return this.questionsAndAnswersQuestion;
	}

	public void setQuestionsAndAnswersQuestion(String questionsAndAnswersQuestion) {
		this.questionsAndAnswersQuestion = questionsAndAnswersQuestion;
	}

}