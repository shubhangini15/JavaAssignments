package com.filehandling;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		// Way2: FileReader(File)...First create file object and then FileReader object
		File file = new File("C:\\Users\\Nehal\\Music\\Sample\\abc.txt");

		//Way1: FileReader(String)
		// FileReader fr = new FileReader("C:\\Users\\Nehal\\Music\\Sample\\abc.txt");

		if (file.exists()) {
			System.out.println("File is available: " + file.exists());

			//Create a file reader object
			FileReader fr1 = new FileReader(file);
			int size = (int) file.length();
			System.out.println("*******Output using read(String) method******** ");
			for (int i = 0; i < size; i++) {
				System.out.print((char) fr1.read());
			}
			System.out.println("\n");
			
			FileReader fr = new FileReader(file);
			System.out.println("********Output using read(char[]) method********");
			char[] ch = new char[20];
			fr.read(ch);
			for (char c : ch) {
			System.out.print(c);
			}
			System.out.println("\n");
			
			FileReader fr2 = new FileReader(file);
			System.out.println("********Output using read(char[] buf ,int off, int length) method********");
			char[] buf = new char[(char)file.length()];
			System.out.println(fr.read(buf,0,(int) file.length()));
			
		} else {
			
			file.createNewFile();
			System.out.println("File created! ");
		}
	}

}
