package com.stringConceptProblems;

public class ReverseEvenString {
	
	public static void main(String[] args) {
		
		String str = "This is a simple java program ";
		//System.out.println(str.length());
		
		String[] strArray = str.split(" ");
		//System.out.println(s.length);
		
		
		for(int i = 0, j = i+1; i < strArray.length;i+=2,j+=2 ) { 
			System.out.print(strArray[i]+" ");
				String currentVal = strArray[j];
				for(int k = currentVal.length()-1; k >= 0; k--) {
					System.out.print(currentVal.charAt(k));
				}
				System.out.print(" ");
			}
		}
	}