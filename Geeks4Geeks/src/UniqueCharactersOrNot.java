import java.util.Arrays;

/*Whether String has unique characters or not
 * 
 * Take a String from user or a string is given 
 * Sort a String in Java (2 different ways)
String class doesn’t have any method that directly sort a string, but we can sort a string by 
applying other methods one after other.

Method 1(natural sorting) :

1. Apply toCharArray() method on input string to create a char array for input string.
2. Use Arrays.sort(char c[]) method to sort char array.
3. Use String class constructor to create a sorted string from char array.
Note : As we know that String is immutable in java, hence in third step we have to create a new string.*/

public class UniqueCharactersOrNot {
	
	/*A static method belongs to the class rather than object of a class.
	 * A static method can be invoked without the need for creating an instance of a class.*/
	
	public static String sortString(String str) { 
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		
		for(int i = 0; i < ch.length; i++) {
			for(int j = 1; j < ch.length; j++) {
				char ch1 = ch[i];
				char ch2 = ch[j];
				if(ch1 == ch2) {
					System.out.println("No");
					break;
			}
	}
		}
		return new String(ch);
	}
	/*public boolean unique(String s) {
		for(int i = 0; i < s.length(); i++) {
			for(int j = 1; j < s.length(); j++) {
				char ch1 = s.charAt(i);
				char ch2 = s.charAt(j);
				if(!(ch1 == ch2)) {
					return true;
				} else if (ch1==ch2)
					return false;
				System.out.println("No");
			}
		}
		return false;
		
	}*/
	public static void main(String[] args) {
		String str1 = "yiopwui";
		String str2 = "AkolzpQ";
		String outputString = sortString(str1);
		String outputString2 = sortString(str2);
	
		//UniqueCharactersOrNot uniqueChar = new UniqueCharactersOrNot();
		//uniqueChar.unique(str1);
		//UniqueCharactersOrNot.sortString(str1);
		//UniqueCharactersOrNot.sortString(str2);
		System.out.println(outputString);
		System.out.println(outputString2);
		

	}

}
