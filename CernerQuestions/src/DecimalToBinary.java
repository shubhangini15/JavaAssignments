/*I used loop iteration, if condition for while loop is no longer true
 * so loop terminates and returns the value
 * Input = 365
 * Output= 101101101
 * */

import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		while(num > 0) {
			int remainder = num%2;
			
			System.out.print(remainder);
			num = num/2;
		}

	}

}
