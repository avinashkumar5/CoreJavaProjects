package com.avinash.training;

public class Casting {

	public static void main(String[] args) {
		
		//Implicit 
		
		double a;
		int d = 10;
		
		a = d;  // Java Compiler [Auto]
		System.out.println("Implicit :: " + a);
		
		//Explicit 
		
		double b = 40.56;
		int t ;
		
		t = (int) b;  // Programmer Do 
        System.out.println("Explicit :: " + t);
	}

}
