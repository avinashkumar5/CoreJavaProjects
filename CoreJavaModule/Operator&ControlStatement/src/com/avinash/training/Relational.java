package com.avinash.training;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Training";
				
		String s2 = new String("Training");
		
		//equals method always comes with String Class
		
		
		boolean ans  = s.equals(s2); //Deep Comparsion
		System.out.println(ans);
		
		boolean ans1 = (s == s2); //Shallow Comparsion
		System.out.println(ans1);
		
		int A = 10;
		int B = 10;
		
		boolean ansInt = (A == B);  //Equal To
		System.out.println("EQUAL --> " + ansInt);
		
		boolean ansInt1 = ( A != B); //Not equal To
		System.out.println("NOT EQUAL -->" + ansInt1);
		
		boolean less = (A < B);
		System.out.println("LESSTHAN  ::"+ less);
		
		
	}

}
