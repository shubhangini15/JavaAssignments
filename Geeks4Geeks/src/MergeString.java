/*
 * Input: 5685 878
 * Output: 5685878
 * 
 * */
import java.util.*;
import java.lang.*;
import java.io.*;

class MergeString {
	public static void main (String[] args) {
		
	/* Take input from user*/
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			/* I always prefer to read input using nextLine() and then parse the string.
			 * Using next() will only return what comes before a space. 
			 * nextLine() automatically moves the scanner down after returning the current line.
			 * A useful tool for parsing data from nextLine() would be str.split("\\s+").
			 * */
			String str = sc.nextLine();
			//Parse the string
			String strings[] = str.split(" ");
		
			/* store the length of string in len1 & len2 variable
			 * After parsing the string, save string[0] length in len1 and string[1] length in len2
			 * */
			 
			int len1 = strings[0].length();
			int len2 = strings[1].length();
			
			/* len variable contains smaller string with smaller length*/
			int len = (len1 > len2)? len2 : len1;
			
			/* This loop will run upto the length of len*/
			for(int j=0; j < len; j++) {
				//Convert string to char by .charAt()
				System.out.print(strings[0].charAt(j)+""+strings[1].charAt(j));
			}
			
			if (len1 > len2) {
				for (int j = len; j < len1; ++j)
				System.out.print(strings[0].charAt(j));
				
			}else if (len1 < len2) {
				for(int j = len; j < len2; ++j)
				System.out.print(strings[1].charAt(j));
			
		}
			//move cursor to next line
			System.out.println("");
	}
		
		
		
}
}
