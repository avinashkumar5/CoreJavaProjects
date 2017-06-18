package com.avinash.training;

public class SimpleMultiArray {

	public static void main(String[] args) {

		int a[][] = {{3,5,6},{2,3,5}};  //Declare and initalize
		
		System.out.println("length" + a.length);
		//Printing 2-D Array
		for(int r = 0 ; r< 2 ; r ++){  //traversing for Rows
			for(int c = 0 ; c< 3 ;  c++){ // traversing for Columns
				System.out.print("row and col index :: [" + r + "," +c + "]");
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}
}
