import java.io.*;
import java.util.*;

public class KeyPair {

	public static void main(String[] args) {
		int sum = 0;
		
		//@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		int T = input.nextInt();
		for(int t =0; t < T; t++) {
		
		int num = input.nextInt();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {	
			int arr = input.nextInt();
			arrList.add(arr);
		}
		
		int additionInput = input.nextInt();
		boolean found = false;
		for(int j = 0; j < arrList.size(); j++) {
			for(int k = j+1; k < arrList.size(); k++) {
				sum = arrList.get(j) + arrList.get(k);
				
			if(sum == additionInput) {
				System.out.println("Yes");
				found = true;
				break;
			}
			}
		}
		if(!found)
			System.out.println("No");
	}
}
}