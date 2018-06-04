package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		
		//creating File
		File f1 = new File("D:/abc.txt");
		
		System.out.println("Checking file");
		
		if(f1.exists()) {
			System.out.println("Is file available: "+f1.exists());
		} else {
			f1.createNewFile();
			System.out.println("File created! ");
		}
		
		

	}

}
