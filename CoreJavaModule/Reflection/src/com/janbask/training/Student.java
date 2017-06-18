package com.janbask.training;

public class Student {
	
	private String studentName = "TestStudent";
	
	private static String age = "21";
	
	private long roll = 13;
	
	public Student(){
		System.out.println("Default constructor");
	}
	
	private Student(long r){
		this.roll = r;
	}
	
	public Student(String s, String a, long r){
         this.studentName = s;
         this.age = a;
         this.roll = r;
	}
	
	public void getStudentInfo(){
		System.out.println("Student [ " + this.studentName + " , " + this.roll + " , " + this.age + " ]");
	}
	
	public static void test(){
		System.out.println("TEST");
	}

}
