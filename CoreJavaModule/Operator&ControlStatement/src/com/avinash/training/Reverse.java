package com.avinash.training;

public class Reverse {

	private static int num;
	
	public Reverse(int i){
		num = i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse r = new Reverse(12321);
		
		int rem, rev = 0, sum = 0;
		int n = num;
		while(num != 0){
			rem = num %10;
			rev = (rev* 10) + rem;
			sum = sum + rem;
			num = num/10;
		}
		
		System.out.println("Reverse of number :: " + rev);
		System.out.println("Sum of digits :: " + sum);
		
		if(n == rev){
			System.out.println(rev + " is palindrome");
		}else{
			System.out.println(rev + " is not palindrome");
		}
	}

}
