package com.janbask.training;

public class StaticBlock {
	
	private static String type;
	
	static{  // static block
		type = "Static Block";	   
		System.out.println("Static Block Called");
		System.out.println("I am called ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("Static variable :: " + StaticBlock.type);		
		
	}

}
