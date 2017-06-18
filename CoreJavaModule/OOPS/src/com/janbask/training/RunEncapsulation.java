package com.janbask.training;

/**
 * Class to demonstrate encapsulation
 * @author PINTU
 *
 */
public class RunEncapsulation {

	
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(12345);
		emp.setEmpName("Janbask");
		emp.setSalary("23444");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(12346);
		emp2.setEmpName("Training");
		emp2.setSalary("23545");
		
        //Employee printing
		System.out.println("Employee 1 Information :: " + emp);
		System.out.println("Employee 2 Information :: " + emp2);
		
		//check if employee name is Janbask 
		
		if(emp.getEmpName().equalsIgnoreCase("Janbask")){
			System.out.println("Welcome :: "+ emp.getEmpName());
		}
	}

}
