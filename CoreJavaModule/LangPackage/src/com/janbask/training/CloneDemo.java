package com.janbask.training;

public class CloneDemo {

	public static void main(String[] args) {

		Student obj1 = new Student(234, "TestUser");
		System.out.println("Object one Values :: " + obj1.toString());
		System.out.println("Object one created :: " + obj1.hashCode());
		
		try {
			
			Student obj2 = (Student) obj1.clone();
			System.out.println("Object two Values :: " + obj2.toString());
			System.out.println("Object two created :: " + obj2.hashCode());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
