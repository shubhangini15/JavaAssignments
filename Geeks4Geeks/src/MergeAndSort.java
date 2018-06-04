import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class MergeAndSort {

	public static void main(String[] args) {
		/*
		 * T = no. of test cases, N = no. of arrays, E = no. of elements in an array
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter T: ");
		int testCase = input.nextInt();
	
		//System.out.println("******" + testCase + "******");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int t = 0; t < testCase; t++) {
			// Initially list is empty. ArrayList is used when size is unknown
			System.out.println("Enter numArray: ");
			int numArray = input.nextInt();

			while (numArray != 0) {
				System.out.println("Enter numElement: ");
				int numElement = input.nextInt();
				for(int i = 0; i < numElement; i++) {
				list.add(input.nextInt());
				input.nextLine();
				
				}
				numArray--;
			}
		
		/*The easiest way to remove repeated elements 
		 * is to add the contents to a Set (which will not allow duplicates) 
		 * and then add the Set back to the ArrayList*/
                Set<Integer> hashSet = new HashSet<> ();
                hashSet.addAll(list);
                list.clear();
                list.addAll(hashSet);
				Collections.sort(list);
				System.out.println("*****After Sorting****");
				for (int counter : list) {
					System.out.print(counter+" ");
					
				}
				list.clear();
		}
				System.out.println();
			}
		}
	
