package com.janbask.training;

public class StaticMethod {

	private static int j;
	
	public String getName(){
		return "Training";
	}
	
	public static String getValue(){
		return "Value is 5";
	}
	
	public static boolean isTrue(){
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StaticMethod s = new StaticMethod();
		 s.getName();
         getValue();
         isTrue();
	}

}
