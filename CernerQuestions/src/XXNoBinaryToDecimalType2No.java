import java.util.*;

public class XXNoBinaryToDecimalType2No {
	
	public static void main(String[] args) {
		int revNum = 0; int count = 0; int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter binary number: ");
		int binary = input.nextInt();
		
		while(binary!=0) {
			// revNum = (110011 % 10) == 1
			revNum = (binary%10);
			
			// 2^0 * 1 = decimalNum is 1
			int decimalNum = (int) (Math.pow(2, count) * revNum);
			sum += decimalNum;
			binary = binary/10;
			count++;
		}
		System.out.println(sum);
	}

}
