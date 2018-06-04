/*Got two strings. Traversed through string1 and another loop to traverse through string2
 * Parsed String character by character. If characters are same then print.
 * Used replace(String.valueof) method to remove duplicates from str1)*/

public class LeastCommonSubsequence {

	public static void main(String[] args) {
		String str1 = "aaddgh";
		String str2 = "aabcdef";
		
		leastCommon(str1,str2);
	}
	static void leastCommon(String str1, String str2) {
		int count = 0;
		char c1; char c2;
		
		for(int i = 0; i < str1.length()-1; i++) {
			for(int j = 0; j < str2.length()-1; j++) {
				 c1 = str1.charAt(i);
				 c2 = str2.charAt(j);
				if(c1 == c2 ) {
					System.out.print(c1+"");
					count++;
					str1 = str1.replace(String.valueOf(c1), ""); //remove duplicates from string str1		
				}
				
			}
			
		}
		System.out.println();
		System.out.println(count);
	}
	
	

}
