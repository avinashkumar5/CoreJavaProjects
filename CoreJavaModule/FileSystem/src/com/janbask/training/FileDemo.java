package com.janbask.training;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String args[]){
		
		String fileName[] = {"C://Users//PINTU//Desktop//Training//Module//FileSystem//input.txt", 
				             "C://Users//PINTU//Desktop//Training//Module//FileSystem//output.txt"};  // declaration and initialization
		
		File f = null; 
		
		for(String s : fileName){
		   try {
				f = new File(s);
				f.createNewFile();
				System.out.println("Absoulute Path :: " + f.getAbsolutePath());
				
				System.out.println("LastModifed :: " + f.lastModified());
				
				System.out.println("Length :: " + f.length());
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			//f.delete();
		}
	
	}

}
