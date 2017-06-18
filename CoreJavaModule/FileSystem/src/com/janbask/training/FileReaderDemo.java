package com.janbask.training;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {
			
			FileReader fileReader = new FileReader("C://Users//PINTU//Desktop//Training//Module//FileSystem//input.txt");
			int i;
			while((i = fileReader.read()) != -1){
				char c = (char) i;
				System.out.print(c);
			}
			
			fileReader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
