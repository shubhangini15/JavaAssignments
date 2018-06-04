/*A native solution to print all combination of 4 elements in A[] with sum equal to X*/

public class FoursumUsingArray {
	
	static int[] getCombination(int[] arr, int sum) {
		// Fix the first element and find other three
		for(int i = 0; i < arr.length-3; i++) {
			// Fix the second element and find other two
			for(int j = i+1; j < arr.length-2; j++) {
				// Fix the third element and find the fourth
				for(int k = j+1; k < arr.length-1; k++) {
					// Find the fourth element
					for(int l = k+1; l < arr.length; l++) {
						int total = arr[i]+arr[j]+arr[k]+arr[l];
						if(sum == total) {
							System.out.println(arr[i]+","+arr[j]+","+arr[k]+","+arr[l]);
						}
					}
				}
			}
		}
    return arr;
	}
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,0}; 
		int sum = 6;
		getCombination(arr,sum);
	}

}
