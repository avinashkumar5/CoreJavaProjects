package com.janbask.training;

/**
 * CompileTime Ploymorphism
 * @author PINTU
 *
 */
public class MethodOverloading {

	public static int add(int a, int b){
		return a + b;
	}
	
	public static float add(int a, float b){
		return a + b;
	}
	
	public static int add(int a, int b, int c){
		return a + b + c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-geinerated method stub
        
		System.out.println("Addition of 2 integer :: " + add(4,5));
		System.out.println("Addition of 2 integer and float :: " + add(9,5.5f));
		System.out.println("Addition of 3 integer :: " + add(4,5,12));
	}

}
