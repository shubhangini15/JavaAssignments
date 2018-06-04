package com.stringConceptProblems;

import java.util.Scanner;

public class ReverseString {

		String s1;
		public void reverse(String str) {
			int size = str.length();
			char[] ch = new char[size];
			
			for(int i = 0; i < size; i++) {
				
				ch[i] = str.charAt(i);
			}
			for(int j = size-1; j >= 0; j--) {
				char[] ch1 = Character.toChars(j);
				s1 = String.valueOf(ch1);
				System.out.print(ch1);
			}	
			System.out.println("");
			for(int k = 0; k < s1.length(); k++) {
				System.out.print(ch[k]);
			}
		}
	
		
		public static void main(String[] args) {
			System.out.println("Enter a sentence: ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			
			ReverseString rev = new ReverseString();
			rev.reverse(str);

		}
	

}
