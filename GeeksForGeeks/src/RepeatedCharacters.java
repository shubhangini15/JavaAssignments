import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();
		

		for (int t = 0; t < T; t++) {
			String str = input.nextLine();

			boolean found = false;
				//outerloop: //label for the outer loop. It can be used with break
				for (int i = 0; i < str.length()-1 && !found; i++) {
					//System.out.println("Value of i: "+i);
					for (int j = i + 1; j < str.length(); j++) {
						//System.out.println("Value of j: "+j);
						/********* STRING TOKENISATION ************/
						// use charAt() to get each character to examine it
						char temp = str.charAt(i);
						char temp1 = str.charAt(j);
						if (temp == temp1) {
							System.out.println(temp);
							found = true;
							break;// outerloop;
						}

					}

				}
			if(!found) 
				System.out.println("-1");
			
		
		}
		
	}
}
