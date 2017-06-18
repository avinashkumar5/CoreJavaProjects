package com.janbask.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args) {

		FileInputStream in = null;
		FileOutputStream out = null;
		//File f = new File("C://Users//PINTU//Desktop//Training//Module//FileSystem//input.txt");
		try{
			in = new FileInputStream("C://Users//PINTU//Desktop//Training//Module//FileSystem//input.txt");
			out = new FileOutputStream("C://Users//PINTU//Desktop//Training//Module//FileSystem//output.txt");
			
			int i;
			while( (i = in.read()) != -1){ // reading from source
				out.write(i); //writing to destination
			}
			
			in.close();
			out.close();
			
		}catch(IOException e){
			
		}
		
	}

}
