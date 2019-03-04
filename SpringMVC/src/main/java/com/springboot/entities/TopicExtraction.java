package com.springboot.entities;

import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class TopicExtraction {
		private Properties prop;
		private StanfordCoreNLP pipeline;
	
	
	public TopicExtraction() {
		prop = new Properties();
		prop.setProperty("annotators","tokenize, ssplit, pos");
		pipeline =  new StanfordCoreNLP(prop);
	}
	public String getTopic(String text) {
		String result = "";
		Annotation document = new Annotation(text);
		pipeline.annotate(document);
		
		List<CoreMap> sentences = document.get(SentencesAnnotation.class);

		for(CoreMap sentence: sentences) {
		  for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
		    String word = token.get(TextAnnotation.class);
		    String pos = token.get(PartOfSpeechAnnotation.class);
		    System.out.println(String.format("Print: woed: [%s] pos: [%s]",word,pos));
		    if(pos.equals("NN") || pos.equals("NNP") || pos.equals("JJ")) {
		    	result+=word+"-";
		    }
		  }
		}
		return result;			
	}
	
	public static void main(String args[]) {
		TopicExtraction te = new TopicExtraction();
		System.out.print(te.getTopic("citrus"));
	}
}
