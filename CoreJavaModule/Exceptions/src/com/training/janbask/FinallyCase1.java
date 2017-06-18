package com.training.janbask;

public class FinallyCase1 {

	public static void main(String[] args) {

		try{
			int i = 25/5;
			System.out.println("" + i);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occurs :: " + e.getMessage());
		}finally{
		    System.out.println("Finally Block Exceuted with No exception occurred *** CASE 1****");
		}	
	}
}
