import java.util.*;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		StringPalindromeOrNot.checkPalin(inputString);
		System.out.println();
	}

	public static boolean checkPalin(String str) {
		int first = 0;
		int last = str.length() - 1;

		while (last > first) {
			if (str.charAt(last) != str.charAt(first)) {
				System.out.println("Is Not Palindrome");
				return false;

			}
			first++;
			last--;
		}
		System.out.println("Is Palindrome");
		return true;

	}
}
