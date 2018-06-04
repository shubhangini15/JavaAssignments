import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();

		for (int j = 1; j <= num; j++) {
			if (input.hasNextLine()) {
				String str = input.nextLine();

				int len = str.length();
				for (int i = len - 1; i >= 0; --i) {
					char character = str.charAt(i);
					System.out.print(character);

				}
				System.out.println();
			}
		}

	}
}
