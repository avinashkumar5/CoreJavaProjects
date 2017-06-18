package com.avinash.training;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 21;
		boolean flag = false;
		for(int j = 2 ; j < i ; j++){
			if(i % j == 0){	
				flag = true;
				break;
			}
		}
		
		if(flag){
			System.out.println(i + " is not prime number");
		}else{
			System.out.println(i + " is prime number");
		}
	}

}
