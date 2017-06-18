package com.janbask.training;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :: ");
		System.out.println("Number accepted was :: " + sc.nextInt());
		
		System.out.println("Enter the String :: ");
		System.out.println("String accepted was :: " + sc.next());
		
		System.out.println("Enter the Float Number :: ");
		System.out.println("Float accepted was :: " + sc.nextFloat());
		
		System.out.println("Enter the Double Number :: ");
		System.out.println("Double accepted was :: " + sc.nextDouble());
		
		
	}

}
