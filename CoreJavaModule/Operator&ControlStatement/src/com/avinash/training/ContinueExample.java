package com.avinash.training;

public class ContinueExample {

	public static void main(String[] args) {

		String s ="people are getting panic";
		           
		int numOfP = 0;
		
		for(int i =0 ; i< s.length() ; i++){
			
			if(s.charAt(i) != 'p')
				continue;
				
		    numOfP ++;	
		}
		
		System.out.println("Number of P are :: "+ numOfP);
	}

}
