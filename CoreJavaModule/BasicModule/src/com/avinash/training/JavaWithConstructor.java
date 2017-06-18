package com.avinash.training;

public class JavaWithConstructor {

	int var;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		JavaWithConstructor javaConst = new JavaWithConstructor();
		System.out.println(javaConst.var + "," + javaConst.name);
		
		JavaWithConstructor javaConstParam = new JavaWithConstructor(4, "Karan");
		System.out.println(javaConstParam.var + "," + javaConstParam.name);
		
		JavaWithConstructor javaConstParam1 = new JavaWithConstructor(5);
		System.out.println(javaConstParam1.var + "," + javaConstParam1.name);
	}
	
	public JavaWithConstructor(){
		System.out.println("Default Constructor");
	}
	
	public JavaWithConstructor(int v, String n){
		var = v;
		name = n;
	}

	public JavaWithConstructor(int v){
		var = v;
	}
}
