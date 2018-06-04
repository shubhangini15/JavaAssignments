/*Finding all possible combinations of numbers to reach a given sum.
 * Recursive solution for generating permutations of solutions
 * Traverse through the array of numbers and chose the first element in the array and compare it to the target value.
 * Create two arrayList, one to keep the list of elements traversed and fulfilled the condition and other
 * to keep a record of remaining elements.
 * array is {1,2,3} and target = 3
 *  */

	import java.util.ArrayList;
	import java.util.Arrays;

	class CombinationOfNumberForSum {
	    static void sum_up_recursive(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
	       int s = 0;
	       for (int x: partial) 
	    	   s += x;
	       if (s == target)
	            System.out.println(Arrays.toString(partial.toArray()));
	       if (s >= target)
	            return;
	       for(int i=0;i<numbers.size();i++) {
	    	   //arrayList contains remaining set of numbers
	             ArrayList<Integer> remaining = new ArrayList<Integer>();
	            
	             //returns the element at the specified position in the "numbers" list
	             int n = numbers.get(i);
	             for (int j=i+1; j<numbers.size();j++) 
	            	 remaining.add(numbers.get(j));
	             ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
	             
	             //appends the specified element n at the end of the "partial" list
	             partial_rec.add(n);
	             sum_up_recursive(remaining,target,partial_rec);
	       }
	    }
	    static void sum_up(ArrayList<Integer> numbers, int target) {
	        sum_up_recursive(numbers,target,new ArrayList<Integer>());
	    }
	    public static void main(String args[]) {
	        Integer[] numbers = {3,9,8,4,5,7,10};
	        int target = 15;
	        sum_up(new ArrayList<Integer>(Arrays.asList(numbers)),target);
	    }
	}

