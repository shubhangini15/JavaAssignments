import java.lang.reflect.Array;
import java.util.*;

public class IsBinaryNumberMultipleOf3 {

	public static void main(String[] args) {
		int sum = 0, mul = 0;

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		while(num-- > 0) {
		//for (int i = 0; i < num; i++) {
			String str = input.nextLine();
			
			int incre = 0;
			
			for (int j = str.length() - 1; j >= 0; j--) {
				int power = (int) Math.pow(2, incre);
				incre++;

				if (str.== 1) {
					mul = power * 1;
				} else if (j == 0) {
					mul = power * 0;
				}
				sum += mul;
			}
			System.out.println(sum);
			if (sum % 3 == 0) {
				System.out.println("Res: 1");
			} else {
				System.out.println("Res: 0");
			}
		}
	}

	

}
