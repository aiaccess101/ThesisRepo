package com.springboot.entities;

import net.sourceforge.jFuzzyLogic.FIS;

public class FuzzyLogic {
	private FIS fis;
	public FuzzyLogic() {
		fis = FIS.load(getClass().getClassLoader().getResource("file/fuzzy.fcl").getPath(),true);		
		
	}
	public String getOutput(double examAverage, double improvementRate) {
		String output = "";
		fis.setVariable("exam_average", examAverage);
		fis.setVariable("improvement_rate", improvementRate);
		fis.evaluate();
		double result = fis.getVariable("result").getValue();
		if(result<=50) {
			output = "LOW";
		}else if(result<=80) {
			output = "GOOD";
		}else if(result<=100) {
			output = "HIGH";
		}
		return output;
	}
	public static void main(String args[]) {
		FuzzyLogic fl = new FuzzyLogic();
		System.out.print(fl.getOutput(69,3));
	}
}
