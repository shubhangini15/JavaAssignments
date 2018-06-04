/*A Java program to find if there is a zero sum subarray
 * returns true if arr[] has a subarray with zero sum
 * create an empty HashMap for storing sum and index
 * Traverse through the given array
 * Return true if
			 * 1) Current element is 0
			 * 2) sum of elements from 0 to i is 0
			 * 3) sum is already present in HashMap
			 * 	*/

import java.util.*;

public class SubarrayWithZeroSum {
	
	//returns true if arr[] has a subarray with zero sum	
	boolean subArrayExist(int arr[]) {
		
		// create an empty HashMap for storing sum and index
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		// Initialize sum
		int sum = 0;
		
		//Traverse through the given array
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			/*Return true if
			 * 1) Current element is 0
			 * 2) sum of elements from 0 to i is 0
			 * 3) sum is already present in HashMap*/
			if(arr[i]==0 || sum == 0 || hm.get(sum) != null) {
				System.out.println("Found 0 in the subarray");
				return true;
			}
			
			// add sum to HashMap for comparison
			hm.put(sum, i);
		}
		//We reach here only when above condition is not fulfilled
		System.out.println("Couldn't find the subarray");
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1,4,-2,-2,5,-4,3};
		int[] arr1 = {-3, 2, 3, 1, 6};
		int[] arr2 = {4,2,0,1,6};
		int[] arr3 = {5};
		
		// create a new SubarrayWithZeroSum object and initialize it 
		SubarrayWithZeroSum objectArr = new SubarrayWithZeroSum();
		objectArr.subArrayExist(arr3);
		objectArr.subArrayExist(arr);
		objectArr.subArrayExist(arr1);
		objectArr.subArrayExist(arr2);
		
		
	}

}
