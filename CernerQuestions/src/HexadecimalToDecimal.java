/*
 * We know that in hexadecimal number uses 16 symbols {0, 1, 2, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F} 
 * to represent all numbers. Here, (A, B, C, D, E, F) represents (10, 11, 12, 13, 14, 15).
 * Created a String to store the hexadecimal 
 * Traversed through the string and parsed string character by character. 
 * Using indexOf method got the index of character and used that to calculate value. */
public class HexadecimalToDecimal {

	public static int hexaToDec(String hexa) {
		
		String digits = "0123456789ABCDEF";
		hexa = hexa.toUpperCase();
		
		int result = 0;
		
		for(int i = 0; i < hexa.length(); i++) {
		char c = hexa.charAt(i);
		int index = digits.indexOf(c);
		result = 16 * result + index;
		}
		System.out.println(result);
		return result;
		}
	
	public static void main(String[] args) {
		String hexa = "1a";
		hexaToDec(hexa);

	}

}
