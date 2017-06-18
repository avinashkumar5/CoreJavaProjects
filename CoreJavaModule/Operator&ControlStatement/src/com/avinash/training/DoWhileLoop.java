package com.avinash.training;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax
		/* exit control loop
		 * initialization
		 * do{
		 * 
		 *   //statements
		 *   increment/decrement
		 * }while(condition);
		 * 
		 */
		
		int i =1; //intialization
		do{
			System.out.print(i + ",");
			i += 2;  //increment/decrement
		}while(i<=9); // condition
		
	}

}
