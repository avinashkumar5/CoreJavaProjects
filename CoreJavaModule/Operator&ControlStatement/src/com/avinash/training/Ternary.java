package com.avinash.training;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 20;
		int B = 10;
		int C = 30;
		
		int ans = ((A != B)) ? 40 : 50;  //short-cut of If- else
		System.out.println("ANSWER :: "+ ans);
		
		
		int tradAns;
		//Tradational
		
		if( A != B){
		   tradAns = 40;	
		}else{
		   tradAns = 50;
		}
	
		System.out.println("TRAD ANS :: " + tradAns);
	    
		/*
		 * if( A > B && A > C){
		 *   S = A
		 * else if ( B > C && B > A) {
		 *   S = B
		 * else 
		 *   S = C
		 */
		
		int S = ((A > B) && (A > C)) ? A : ((B > C) && (B > A)) ? B : C;
		System.out.println("Largest of three No :: " + S);
	}

}
