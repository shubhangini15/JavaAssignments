import java.util.*;

public class ChangeStringToLowerOrUpperCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T-->= 0) {
		String str = input.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			char firstChar = str.charAt(i);
			if(Character.isLowerCase(firstChar)) {
				System.out.println(str.toLowerCase());
				break;
			} else if(Character.isUpperCase(firstChar)) {
				System.out.println(str.toUpperCase());
				break;
			}
		}
	}
	}

}
