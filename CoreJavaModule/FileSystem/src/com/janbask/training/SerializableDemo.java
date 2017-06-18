package com.janbask.training;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {

		try {
			Student student = new Student("Janbask", 34, "XII");
			FileOutputStream file = new FileOutputStream("C://Users//PINTU//Desktop//Training//Module//FileSystem//output.txt");
			ObjectOutputStream stream = new ObjectOutputStream(file);
			stream.writeObject(student);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
