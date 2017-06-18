package com.training.janbask;

public class UnCheckedException {

	public static void main(String[] args) {

		
		int a[] = {3,4,5,6};
		
		System.out.println("Inserting element at Fifth location in array");
		
		try{
			a[3] = 10;
		}catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("Exception :: "+ e.getStackTrace());	
		}
		
		System.out.println("Program executed ");
	}

}
