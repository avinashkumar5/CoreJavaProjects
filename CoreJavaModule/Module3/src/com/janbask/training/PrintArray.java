package com.janbask.training;

public class PrintArray {

	public static void main(String[] args) {

   		int a[] = {1,2,3,4,5};
   		int b[] = {6,7,8,9,10,11};
   		
   		int c[] = new int[a.length + b.length];
   		
   		int max = (a.length > b.length) ? a.length : b.length;
   		   		
   		int counter = 0;
   		for(int i= 0 ; i< max ; i++){
   			if(i < a.length){
   				c[counter] = a[i];
   	   			counter ++;	
   			}
   			if(i < b.length){
   				c[counter] = b[i];
   	   			counter ++;
   			}
   	    }
   		
   		for(int k = 0 ; k < c.length ; k++){
   			System.out.print(c[k] + ",");
   		}
	}

}
