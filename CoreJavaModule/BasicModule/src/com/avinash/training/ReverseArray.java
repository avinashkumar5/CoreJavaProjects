package com.avinash.training;

public class ReverseArray {

	public static void main(String[] args) {

		int a[] = {1,3,5,78,6,7,10};
		
		//Printing in Reverse order 1st WAY
		System.out.println("FIRST WAY");
		for(int i = a.length-1 ; i >= 0 ; i--){
			System.out.print(a[i] + " ");
		}
		
		// 2nd way
		
		int b[] = new int[a.length];
		int j = 0;
		for(int i = a.length-1 ; i >= 0 ; i--){
			b[j] = a[i];
			j++;
		}
		
		System.out.println("");
		System.out.println("SECOND WAY");
		for(int i = 0 ; i < b.length ; i++){
			System.out.print(b[i] + " ");
		}
		
		//3rd way
		System.out.println("");
		System.out.println("THIRD WAY");
		int i,k, temp;
		for(i = 0, k = a.length -1 ; i<k ; i++,k--){
		    	temp = a[i];
		    	a[i] = a[k];
		    	a[k] = temp;
		}
		
		for(i = 0 ; i < a.length ; i++){
			System.out.print(a[i] + " ");
		}
	}

}
