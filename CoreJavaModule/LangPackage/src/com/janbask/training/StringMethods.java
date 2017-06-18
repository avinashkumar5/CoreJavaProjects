package com.janbask.training;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Java is good language";
		
		//charAt -- It will return the character present at that index
		
		System.out.println("CHARAT Function :: " + s.charAt(8));
		
		String s1 = "Training";
		String s2 = "training";
		
		//equal and equalIgnoreCase === compares and return boolean result
		
		System.out.println("Equal Function :: " + s1.equals(s2));
		System.out.println("EqualIgnoreCase Function :: " + s1.equalsIgnoreCase(s2));
		
		System.out.println("Length :: " + s1.length());
		
		System.out.println("Replace :: " + s1.replace('n', 'm'));
		
		System.out.println("Substring :: " + s.substring(8, 12));
		
		System.out.println("LowerCase :: " + s1.toLowerCase());
		
		System.out.println("UpperCase :: " + s2.toUpperCase());
		
		//trim -- it is used to remove the trailing and leading spaces from string
		
		String s3 = " TEST ";
		System.out.println("TRIM :: " + s3.trim());
			
		Integer i = 9;
	
		String s4 = String.valueOf(i);
		System.out.println("Value of :: " + s4);
		
		String s5 = "Hello User ";
		System.out.println("toString :: " + s5.toString());
		
		//indexof -- this will return the index of specified character
		
		System.out.println("Index :: " + s.indexOf('o'));
		
		//lastIndexOf -- this will return the last index of specifed character
		
		System.out.println("Last Index :: " + s.lastIndexOf('o'));
		
	}

}
