package com.avinash.training;

public class SelectionSwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax
		
	  /*
	   * switch(condition){
	   *   case 1: {
	   *          break;
	   *      }
	   *   case 2 {
	   *          break;  
	   *   }
	   *   default : {
	   *		  break;   
 	   *    }
	   * }
	   */
        //if(i == 6 && i == 3)
		int i = 6;
		switch(i){
		 case 1: System.out.println("SUN");
		        break;
		 case 2: System.out.println("MON");
	        break;
		 case 3: System.out.println("TUE");
	        break;
		 case 4: System.out.println("WED");
	        break;
		 case 5: System.out.println("THRUS");
	        break;
		 case 6: System.out.println("FRI");
            break;		 
		 case 7: System.out.println("SAT");
	        break; 
	     default : System.out.println("Number not matching with weekdays");
	        break;
		}
		
	}

}
