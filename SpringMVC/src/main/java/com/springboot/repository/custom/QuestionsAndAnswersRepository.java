package com.springboot.repository.custom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.entities.QuestionsAndAnswer;

@Repository
@Transactional
public class QuestionsAndAnswersRepository {

	public List<QuestionsAndAnswer> getAllQuestionsByExamId(EntityManager em, int exam_id){
		StringBuilder builder = new StringBuilder("FROM QuestionsAndAnswer where questionsAndAnswersExamId = :exam_id");
		Query query = em.createQuery(builder.toString());
		query.setParameter("exam_id", exam_id);
		
		List<QuestionsAndAnswer> questionnaire= query.getResultList();
		return questionnaire;
		
	}

	public void addQuestionsAndAnswer(EntityManager em,List<QuestionsAndAnswer> questionnaire) {
		StringBuilder builder = new StringBuilder ("INSERT INTO QuestionsAndAnswer (questionsAndAnswersExamId, questionsAndAnswersNumber, questionsAndAnswersQuestion, "
				+ "questionsAndAnswersChoiceA + questionsAndAnswersChoiceB, questionsAndAnswersChoiceC, questionsAndAnswersChoiceD, questionsAndAnswersAnswer) VALUES ");
		QuestionsAndAnswer qa;
		for(int i = 0 ; i < questionnaire.size();i++){
			qa = questionnaire.get(i);
			builder.append(" (");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersExamId()) + ", ");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersQuestion()) + ", ");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersChoiceA()) + ", ");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersChoiceB()) + ", ");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersChoiceC()) + ", ");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersChoiceD()) + ", ");
			builder.append( String.valueOf(qa.getQuestionsAndAnswersAnswer()));
			builder.append(" ) ");
			
			if(i < questionnaire.size()-1){
				builder.append(", ");
			}
			else{
				builder.append(";");
			}
		}
		
		Query query = em.createQuery(builder.toString());
		query.executeUpdate();
	}
	
}
