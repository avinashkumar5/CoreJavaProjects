package com.avinash.training;

public class Add2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  int a[][] = {{3,5,6},{2,3,5},{4,5,6}};  //Declare and initalize 1 Array
	  int b[][] = {{3,5,6},{2,3,5},{1,4,5}};  //Declare and initalize 2 Array
	  
	  int result [][] = new int[3][3];
	  
	  
	   //adding 2-D Array
	   for(int r = 0 ; r< 3 ; r ++){  //traversing for Rows
			for(int c = 0 ; c< 3 ;  c++){ // traversing for Columns
				result[r][c] = a[r][c] + b[r][c];  
			}
		}
	   
	   //printing the addition result
	   System.out.println("Addition Array");
	   for(int r = 0 ; r < 3 ;r ++){
		  for(int c = 0 ; c < 3 ; c++){
			  System.out.print(result[r][c] + " ");
		  }
		  System.out.println();
	   }
	   int mul[][] = new int[3][3];
	   int n =3;
	   for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               for (int k = 0; k < n; k++)
               {
                   mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
               }
           }
       }
	   System.out.println("Multiplication Array");
	   //printing the multiplication result
	   for(int r = 0 ; r < 3 ;r ++){
		  for(int c = 0 ; c < 3 ; c++){
			  System.out.print(mul[r][c] + " ");
		  }
		  System.out.println();
	   }
		
	}

}
