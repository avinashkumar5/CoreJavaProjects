package com.avinash.training;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5, fact =1;
		for(int j=1; j<= i ; j++){
			fact = fact * j;
		}
		
		System.out.println("Factorial of " + i + " is " + fact);
	}

}
