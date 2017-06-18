package com.avinash.training;

public class SearchNumberBreak {

	public static void main(String[] args) {

		int a[] = {12,45,56,32,76,77,85,43,90};
		
		int searchNumber = 56;
		boolean flag= false;
		int i;
		for(i =0 ; i <a.length ; i++){
			
			if(a[i] == searchNumber){
				flag= true;
				break;
			}
		}
		
		if(flag){
			System.out.println( searchNumber + " number was found at location :: "+ (i+1));
		}else{
			System.out.println( searchNumber + " number is not found");
		}
	}

}
