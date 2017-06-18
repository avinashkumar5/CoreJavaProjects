package com.janbask.training;

import java.util.Scanner;

public class ArrayAccpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length ; i ++){
			System.out.println("Enter the " + (i+1) + " element :: ");
			a[i] = sc.nextInt();
		}
		
		//printing all number
		System.out.println("Accepted array numbers are ");
		for(int i = 0 ; i <a.length ; i ++){
			System.out.print(a[i] + ",");
		}
	}

}
