package com.filehandling;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args)  throws Exception {
		
		File file = new File("C:\\Users\\Nehal\\Music\\Sample\\new.txt");
		
		
		
		if(file.exists()) {
			System.out.println("File already available: "+file.exists());
			
			FileWriter fw = new FileWriter(file);
			fw.write(97);
			fw.write(100);
			//fw.flush();
			fw.close(); //close internally applies flush method
			FileWriter fw1 = new FileWriter(file,true);
			fw1.write("program");
			//fw1.write("language", 13, 21);
			
			//fw1.flush();
			fw.close();
		} else {
			file.createNewFile();
			System.out.println("File created!");
		}
		
	}

}
