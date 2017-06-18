package com.avinash.training;

public class ExtractNumbers {

	public static void main(String[] args) {

		int i = 5670560;
		int rem, sum = 0;
		while(i != 0){
		  rem = i % 10;
		  i = i/10;	
		  sum += rem;
		  System.out.println("Number " + rem + " Left number = " + i);
		}
		
		System.out.println("Sum of digit :: " + sum);
	}

}
