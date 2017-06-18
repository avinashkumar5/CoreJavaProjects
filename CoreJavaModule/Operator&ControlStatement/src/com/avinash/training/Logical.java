package com.avinash.training;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 10;
		int B = 20;
		int C = 10;
		
		System.out.println("LOGICAL AND :: " + ((A == B) && (A == C)));
		
	    /*AND [*] Table
		  A      B   Answer
		  T		 T    T
		  T      F    F
		  F      T    F
		  F      F    F*/
		
		System.out.println("LOGICAL OR :: " + ((A == B) || (A == C)));
		
	    /*OR [+] Table
			  A      B   Answer
			  T		 T    T
			  T      F    T
			  F      T    T
			  F      F    F*/
		
		System.out.println("LOGICAL NOT :: " + ( A != B));
		System.out.println("LOGICAL NOT :: " + ( A != C));
		
		
		
	}

}
