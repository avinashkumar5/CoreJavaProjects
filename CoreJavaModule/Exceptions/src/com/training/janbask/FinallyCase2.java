package com.training.janbask;

public class FinallyCase2 {

	public static void main(String[] args) {
        boolean flag = false;
		try{
			int i = 25/0;
			System.out.println("" + i);
		}catch(NullPointerException e){
			flag = true;
			System.out.println("Null Pointer exeception occured :: " + e.getMessage());
		}finally{
			if(flag){
				System.out.println("Exception occured but handled ****CASE 2****");			
			}else{
				System.out.println("Exception occured but not handled ****CASE 2****");
			}
	
		}
		
	}

}
