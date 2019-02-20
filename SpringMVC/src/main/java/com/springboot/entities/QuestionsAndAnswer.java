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

	@Column(name="questions_and_answers_question")
	private String questionsAndAnswersQuestion;
	
	@Column(name="question_and_answers_difficulty")
	private double difficulty;
	
	@Column(name="question_and_answers_wrongly_answered")
	private int wrongly_answered;
	
	@Column(name="question_and_answers_correctly_answered")
	private int correctly_answered;
	
	@Column(name="question_and_answers_total_answer")
	private int total_answer;
	

	public QuestionsAndAnswer() {
	}
	
	public QuestionsAndAnswer(int id,String answer, String choiceA, String choiceB, String choiceC, String choiceD, String question) {
		this.correctly_answered = 5;
		this.wrongly_answered = 5;
		this.questionsAndAnswersExamId = id;
		this.questionsAndAnswersAnswer = answer;
		this.questionsAndAnswersChoiceA = choiceA;
		this.questionsAndAnswersChoiceB = choiceB;
		this.questionsAndAnswersChoiceC = choiceC;
		this.questionsAndAnswersChoiceD = choiceD;
		this.questionsAndAnswersQuestion = question;
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

	public String getQuestionsAndAnswersQuestion() {
		return this.questionsAndAnswersQuestion;
	}

	public void setQuestionsAndAnswersQuestion(String questionsAndAnswersQuestion) {
		this.questionsAndAnswersQuestion = questionsAndAnswersQuestion;
	}
	
	public double getQuestionsAndAnswersDifficulty() {
		return this.difficulty;
	}

	public void setQuestionsAndAnswersDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}
	
	public int getQuestionsAndAnswersWronglyAnswered() {
		return this.wrongly_answered;
	}

	public void setQuestionsAndAnswersWronglyAnswred(int wrongly_answered) {
		this.wrongly_answered = wrongly_answered;
	}
	public double getQuestionsAndAnswersCorrectlyAnswered() {
		return this.correctly_answered;
	}

	public void setQuestionsAndAnswersDifficulty(int correctly_answered) {
		this.correctly_answered = correctly_answered;
	}
	
	public double getQuestionsAndAnswersTotalAnswer() {
		return this.total_answer;
	}

	public void setQuestionsAndAnswersTotalAnswer(int total_answer) {
		this.total_answer = total_answer;
	}
	public boolean checkAnswer(String answer) {
		if(answer == this.questionsAndAnswersAnswer) {
			return true;
		}else {
			return false;
		}
	}
	public void changeDifficulty(boolean answered) {
		if(answered) {
			this.correctly_answered++;
		}else {
			this.wrongly_answered++;
		}		
		this.total_answer = this.correctly_answered + this.wrongly_answered;
		if((correctly_answered/this.total_answer)<=.20) {
			this.difficulty = 5;
		}else if((correctly_answered/this.total_answer)<=.40) {
			this.difficulty = 4;
		}else if((correctly_answered/this.total_answer)<=.60) {
			this.difficulty = 3;
		}else if((correctly_answered/this.total_answer)<=.80) {
			this.difficulty = 2;
		}else if((correctly_answered/this.total_answer)<=1) {
			this.difficulty = 1;
		}
	}

}