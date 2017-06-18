package com.avinash.training;

public class SelectionIfExample {

	public static void main(String[] args) {

		//Syntax 
		/*
		 * if(condition) 
		 * {
		 *   // True code
		 * }else{
		 *   // False code
		 * }
		 */
		
		int a  = 9 ;
		int b = 5;
		int c = 20;
		
		if(a > b && a > c){
			System.out.println(a + " is greater number ");
		}else if(b > c && b > a){
			System.out.println(b + " is greater number ");
		}else{
			System.out.println(c + " is greater number ");
		}
		
		
		//Odd or even code
		int k = 9;
		
		if(k % 2 == 0){
			System.out.println(k + " is Even Number");
		}else{
			System.out.println(k + " is Odd Number");
		}
	}

}
