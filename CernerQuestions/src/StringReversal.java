
public class StringReversal {

	public static void main(String[] args) {
		String str = "I went to the Bar";
		getReverseWord(str);
	}
	
	static String reverseSentence(String str) {
		char[] arr = str.toCharArray();
		String[] token = str.split(" ");
		
		for(int i = 0; i < str.length(); i++) {
			
		}
		
		return null;
	}
	
	static String getReverseWord(String str) {
		int len = str.length();
		
		for(int i = len-1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}
		return null;
		
	}

}
