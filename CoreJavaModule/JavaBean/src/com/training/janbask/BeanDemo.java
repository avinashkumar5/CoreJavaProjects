package com.training.janbask;

public class BeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m = new Manager();
		
		m.setManagerId(214356);
		m.setName("Sanjay");
		
		// Java Bean
		Employee e = new Employee();
		e.setEmpId(1223);
		e.setEmpName("Apoorva");
		e.setEmpSalary(21212112);
		e.setManager(m);
				
	}

}
