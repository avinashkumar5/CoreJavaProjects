package com.training.janbask;

public class FinallyCase3 {

	public static void main(String[] args) {
        boolean flag = false;
		try{
			int i = 25/0;
			System.out.println("" + i);
		}catch(ArithmeticException e){
			flag = true;
			System.out.println("Arithmetic Execption occurs :: " + e.getMessage());
		}finally{
			if(flag){
				System.out.println("Exception occurs and handled finally executed ****CASE 3 *****");
			}else{
				System.out.println("Exception not occurs and handled finally executed ****CASE 3 *****");
			}
		}
	}

}
