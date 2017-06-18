package com.avinash.training;

public class MinArray {

	public static void main(String[] args) {
		
		int a[] = {21,56,45,23,46,5,67,87,89}; // declaration + initalization
		
		int min = 999;
		for(int i =0; i<a.length ; i++){
			 
			if(a[i] < min){
				// true
				min = a[i];
			}
		}
		
		System.out.println("Minimum value in array :: -> " + min);
		

	}

}
