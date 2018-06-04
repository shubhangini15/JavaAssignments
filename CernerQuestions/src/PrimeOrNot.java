
public class PrimeOrNot {
	public static void main(String[] args) {
		int num = 11;
		boolean isPrime = true;
		if(num == 0 || num == 1) {
			System.out.println("Not Prime");
		} else{
			
		//Since num can't be divided by a number greater than (num / 2),
		//except when we consider "num", which we don't have to consider at all.
			
		for(int i = 2; i <= num/2; i++) {
			
			if(num%i == 0) {
				isPrime = false;
				System.out.println("Not Prime");
				break;
			} 
		}
			if(isPrime) {
				System.out.println("Is Prime");
			}
			}
			
		}
}
	


