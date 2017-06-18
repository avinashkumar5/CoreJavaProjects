package com.janbask.training;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C://Users//PINTU//Desktop//Training//Module//FileSystem//output.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s = (Student) ois.readObject();
			System.out.println("Roll No :: " + s.getRollNo() + ", Name :: " + s.getName() + ", ClassName :: " + s.getClassName() );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
