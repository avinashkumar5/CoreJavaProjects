package com.janbask.training;

public class MethodSignature {
 
	private static double spanNum;  // actual parameter
	private static int noOfEngineers; // actual parameter
	
	public static double calculateAnswer(double span, int noOfEng){ //span and noOfEng are Formal Parameter
		return span + noOfEng;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		spanNum = 50.0;
		noOfEngineers = 45;
		
		double ans = calculateAnswer(spanNum, noOfEngineers);
		
		System.out.println("Answer :: " + ans);
		
	}

}
