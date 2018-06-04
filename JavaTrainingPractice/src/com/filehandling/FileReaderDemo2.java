package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException{
		
		File f1 = new File("C:\\Users\\Nehal\\eclipse-workspace\\JavaTrainingPractice\\src\\com\\filehandling\\FileReaderDemo2.java");
		
		if(f1.exists()) {
			System.out.println("File Available");
			FileReader fr = new FileReader(f1);
			long size = f1.length();
			
			int n = (int)(size/2);
			System.out.println("Size = "+size+ ", n = "+n);
			
			char[] ch = new char[n];
			fr.read(ch);
			System.out.println("**************Using read(char[]) method******************** ");
			System.out.println(ch);
			
			char[] buffer = new char[n];
			fr.read(buffer, 0, n-1);
			System.out.println("***************Using read(char[] buff, int, int) method************* ");
			System.out.println(buffer);
			
			fr.read();
			
		} else {
			f1.createNewFile();
			System.out.println("File Created");
		}
	}

}
