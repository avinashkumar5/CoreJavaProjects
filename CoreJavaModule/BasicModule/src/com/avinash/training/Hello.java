package com.avinash.training;

public class Hello {
    //Fields Starts
	private int id;
	
	private String name;
	
	private char type;
	
	private boolean isTested;
	//Fields Ends
	
	//Method (Main)
	public static void main(String[] args) {
		
		char p = 'T';
		Character test = new Character(p);
		System.out.println(" Value in Lower case :: " + test.toLowerCase(p));
		
		System.out.println("My first Java program");
		
		Hello h1 = new Hello();
		h1.id = 111;
		h1.name = "Karan";
		h1.type = 'T';
		
		Hello h2 = new Hello();
		h2.id = 113;
		h2.name = "TestUser";
		h2.type = 'P';
		//System.out.print(h2.type);
		System.out.println("First Objects Value ::: [" + h1.id + "][" + h1.name +"][" + h1.type + "]");

		System.out.println("Second Objects Value ::: [" + h2.id + "][" + h2.name +"][" + h2.type + "]");
		
   }
}

