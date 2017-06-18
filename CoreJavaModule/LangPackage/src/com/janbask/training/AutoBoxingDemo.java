package com.janbask.training;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 78;
		
		Integer i = a;
		System.out.println("Integer value :: " + i.intValue());
	
        int b = 78;
        Integer ii = b;
        
        System.out.println("Compare result :: " + i.compareTo(ii));
        
        char b1  = 'G';
        int g = (int) b1;
        
	}

}
