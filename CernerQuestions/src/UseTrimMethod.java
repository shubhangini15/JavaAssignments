
public class UseTrimMethod {

	public static void main(String[] args) {
		String sentence = "My name is Sheela Kajwani";
		String str = sentence.trim();
		System.out.println(str);
		for(int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}

	}

}
