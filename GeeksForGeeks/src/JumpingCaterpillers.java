import java.util.*;

public class JumpingCaterpillers {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Set<Integer> hashset = new HashSet<>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter leaves ");
		int numbOfLeaves = input.nextInt();
		
	
		
		//list.add(numbOfCater);
		for (int i = 1; i <= numbOfLeaves; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Enter no. of caterpiller ");
		int numOfCater = input.nextInt();
		while (numOfCater != 0) {
			System.out.print("Enter jumps ");
			int jumps = input.nextInt();
			for(int j=1 ; j < numbOfLeaves ; j++)
				int Object multiple = jumps*j;
				hashset.add(jumps*j);
			if (jumps*j >= numbOfLeaves)
				break;
		}
		numOfCater--;
		System.out.println(hashset);
		

	}

}
