package com.avinash.training;
 
public class ReturnExample {

	public static int add(int g,int k){
		int ans = g + k;
		//return ( g + k ); This is return with evaluating expression
		//return 10; This is return a constant value
		return ans; // This is return with Variable;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 8, b =9;
		
		int result = add(a,b);
		
		System.out.println("Addition of 2 Numbers :: " + result);
	}
	
	

}
