import java.util.BitSet;
/*
 * BitSet to keep a record of seenIntervals. BitSet is a type of array which holds bit values.
 * Traverse all array elements 
 * Find absolute difference between current two 
 * If difference is out of range or repeated, return false
 * The value is true if the interval is currently set in this seenInterval;
 * otherwise, the result is false.
 * */
public class JJumper {

	public static void main(String[] args) {
		int[] arr = {15,19,22,24,25};
		isJolly(arr) ;
		//if true return "Jolly" else "Not Jolly"
		//System.out.println(isJolly(arr) ? "Jolly" : "Not Jolly");
	}
	
	public static boolean isJolly(int[] arr) {
		
		//BitSet to keep a record of seenIntervals. BitSet is a type of array which holds bit values.
		BitSet seenInterval = new BitSet();
		int n = arr.length;
		
		// Traverse all array elements 
		for(int i = 0; i < arr.length-1; i++) {
			
			//Find absolute difference between current two 
			int interval = Math.abs(arr[i]-arr[i+1]);
			
			//If difference is out of range or repeated, return false
			if(interval == 0 || interval >= arr.length) {
				System.out.println("Not Jolly!");
				return false;
			}
			
			// If interval already exists, return false else set
			//The value is true if the interval is currently set in this seenInterval;
			//otherwise, the result is false.
			if(seenInterval.get(interval)) { 
				
				//returns the current state of bit at specified index i.e. interval
				System.out.println(seenInterval.get(interval));
				return false;
			}
			
			//add..set the bit specified by interval
			seenInterval.set(interval);
		}
		
		//returns the number of bits set to true in seenInterval BitSet
		if(!(seenInterval.cardinality() == arr.length-1)) {
			throw new AssertionError();
		}
		System.out.println("Jolly!");
		//assert(seenInterval.cardinality() == arr.length-1);
		return true;
		}
	}


