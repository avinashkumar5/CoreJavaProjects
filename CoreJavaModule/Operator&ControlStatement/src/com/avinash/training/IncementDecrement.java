package com.avinash.training;

public class IncementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 21;
		System.out.println("New value "+ ++a);  //pre - increment [increment then use]
		System.out.println("New value "+ a++);  // post - increment [use then increment]
		
		System.out.println("Latest value " + a);
		
		int b = 23;
		
		System.out.println("New value " + --b); //pre - decrement [decrease then use]
		System.out.println("New value " + b--); //post - decrement [decrease then use]
		
		
		System.out.println("Latest value " + b);
	}

}
