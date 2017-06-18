package com.janbask.training;

public class StaticVariable {

	private static int i = 5;
	
	private static int j = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Static variable :: " + StaticVariable.i);
		
		StaticVariable obj1 = new StaticVariable();
		System.out.println("Static variable :: " + obj1.i);
		obj1.j = 9;
		System.out.println("Non- Static variable :: " + obj1.j + " Static " + StaticVariable.j);
		
		StaticVariable obj2 = new StaticVariable();
		System.out.println("Static variable :: " + obj2.j);
		obj2.j = 15;
		System.out.println("Non- Static variable :: " + obj2.j);
		System.out.println("OBJ 1 " + obj1.j);
	}

}
