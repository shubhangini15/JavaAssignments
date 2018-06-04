import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystemDemo {



	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		String content = null;

		//******Write content into file using FileWriter & BufferedWriter******
		
		File file = new File("C:/Users/Nehal/Documents/springPractice/content.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		for(int i = 0; i<3; i++) {	
			content = input.nextLine();
			bw.write(content);
			bw.newLine();
		}

		bw.flush();
		bw.close();

        //******Read content from the same file*******
		File fileRead = new File("C:/Users/Nehal/Documents/springPractice/content.txt");
		FileReader fr = new FileReader(fileRead);
		long size = fileRead.length();

		int n = (int)(size);
		char[] ch = new char[n];
		fr.read(ch);
		
		System.out.println("**************Read content using read(char[]) method******************** ");
		System.out.println(ch);



	}

}
