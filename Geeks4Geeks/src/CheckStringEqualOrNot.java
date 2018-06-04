import java.util.Scanner;

public class CheckStringEqualOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();

		for (int t = 0; t < T; t++) { 
			String str = input.nextLine();
			CheckStringEqualOrNot string = new CheckStringEqualOrNot();
			string.allCharactersSame(str);

		}
	}

	boolean allCharactersSame(String str) { // REMEMBER

		for (int j = 1; j < str.length();) {
			char char1 = str.charAt(0);
			char char2 = str.charAt(j);
			
			if (!(char1 == char2)) {
				System.out.println("No");
				return false; // REMEMBER
			} else if (char1 == char2) {  // REMEMBER
				j++;
			}
		}
		System.out.println("Yes");
		return false;
	}

}
