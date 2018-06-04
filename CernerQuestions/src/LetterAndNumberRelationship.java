/*Every letter is associated with a number as a-1, b-2,...So if the string is abcd it should give the output as 0123
if the string is with any special characters the output has to be "none"

Traverse through string and parsed character by character.
To calculate the valueUsed formula--> character - 'a'+1
*/
public class LetterAndNumberRelationship {
	public static void main(String[] args) {
		String str = "AbcGdeF";
		String str1 = "ABcdui";
		
		getNumber(str);
		getNumber(str1);
	}
	
/* If the code of a is some number N, then the code of b is N+1,
 *  the code of c is N+2, and so on; the code of Z is N+26.
 *  */
	static public String getNumber(String str) {
		String lowerStr = str.toLowerCase();
		
		for(int i = 0; i < lowerStr.length(); i++) {
			char character = lowerStr.charAt(i);
			if(character == '!'|| character == '$' || character == '@' || character == '*' || character == '#') {
				System.out.println("none");
				break;
			} 
			
			int position = character - 'a' + 1;
			System.out.print(position+"");
		}
		System.out.println("");
		return str;
	}
}
