import java.util.*;
import java.lang.*;

public class WaveArray {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();

			for (int t = 0; t < T; t++) {

				//System.out.println("Enter numbers:");
				int input = sc.nextInt();
				int count = 0;
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				for (int i = 0; i < input; i++) {

					// while(sc.hasNextInt()) {
					arrayList.add(sc.nextInt()); // add input in the arrayList

					Collections.sort(arrayList); // sort the arrayList

				}

				for (int j = 0, k = j + 1; j <= arrayList.size() - 2; j += 2, k += 2) {

					// for (int k = j+1; k ; k += 2) {
					int temp1 = arrayList.get(j); // get j index value and store it in temp1 variable
					int temp2 = arrayList.get(k);
					if (temp1 < temp2 || temp1 == temp2)
						count = temp1;
					temp1 = temp2;
					temp2 = count;
					System.out.print(temp1 + " " + temp2);
					System.out.print(" ");
				}
				if (arrayList.size() % 2 != 0) {
					System.out.print(arrayList.get(arrayList.size() - 1));
				}
			}
		} catch (IndexOutOfBoundsException exception) {

		}

	}
}
