
public class SmallestRepeatingString {

	/* 12/3 = 4; Dividend/divisor = Quotient
	 * The length of the repeating substring must be a divisor of the length of the input string
	 * Search for all possible divisor of str.length, starting for length/2
	 * If i is a divisor of length, repeat the substring from 0 to i the number 
	 * of times i is contained in s.length
	 * If the repeated substring is equals to the input str return true*/
	
	public boolean repeatedSubstringPattern(String str) {
		//calculate the length of the string
		int len = str.length();
		
		//Search for all possible divisor of str.length starting for length/2
		for(int i = len/2; i >= 1; i--) {
			if(len % i == 0) {
				int m = len/i;
				
				String subString = str.substring(0,i);
				
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < m; j++) {
					sb.append(subString);
				}
				
				System.out.println(subString);
				if(sb.toString().equals(str))
					//System.out.println(sb);
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "aaaaaabbbb";
		SmallestRepeatingString strObj = new SmallestRepeatingString();
		strObj.repeatedSubstringPattern(str);
	}
	}







/*boolean repeatedSubstr(String str) {
//HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

for(int i = 0; i < str.length()-2; i++) {
	for(int j = i+1; j < str.length()-1; j++) {
	
	char iPosition = str.charAt(i);
	char jPosition = str.charAt(j);
	
	if(iPosition == jPosition) {
		if(str.charAt(i+1) == str.charAt(j+1)) {
			System.out.println("String match!");
			System.out.println(iPosition + "" + str.charAt(j+1));
			
		}
		//hm.put(iPosition, i);
		//hm.put(jPosition, j);
		return true;
	}			
}
	System.out.println("2");
}
System.out.println("No match found!");
return false;
}
*/
	