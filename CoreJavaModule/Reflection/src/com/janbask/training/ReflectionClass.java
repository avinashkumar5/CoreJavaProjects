package com.janbask.training;

public class ReflectionClass {

	public static void main(String[] args) {
		
		try {
			Class z = Class.forName("com.janbask.training.Student"); //First Way to create CLASS Object
			System.out.println("Class Name :: " + z.getName());
			
			Class myInterface = MyInterface.class;  //Third Way to create CLASS object
			try {
				Student s = (Student) z.newInstance();
				s.getStudentInfo();
				
				System.out.println("Is Interface :: " + z.isInterface());
				
				System.out.println("Is Interface :: " + myInterface.isInterface());
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
