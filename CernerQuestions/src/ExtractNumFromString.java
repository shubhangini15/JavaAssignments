
/*Given a String, remove number from the string
 * Given a string with a mix of comma separated words and numbers, print out two strings which contain only words
 * in one and numbers in the other separated by commas.
 * **************************
 *  Created two empty string number & letter. Traversed through the string and then
 *  parsed the string into character. Used Character.isDigit method to extract number.*/


public class ExtractNumFromString {
	public static String seperateNumAndAlphabets(String str) {
		String number = "";
		String letter = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				number += c;
			} else {
				letter += c;
			}
		}
		System.out.println(letter);
		System.out.println(number);
		return str;
	}

		public static void main(String[] args) {
			String str = "abc1234huiop890";
			seperateNumAndAlphabets(str);
		}

	}

