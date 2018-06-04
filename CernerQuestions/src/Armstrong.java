
/* Java program to determine whether the number is
 * Armstrong number or not*/

public class Armstrong{
	static int isArmstrong(int number) {
		//Call calculateLength function
		int powVal = calculateLength(number);
		int sum = 0;
		int temp = number;
		while(number != 0) {
			int singleNum = number % 10;
			sum = (int) (sum + (Math.pow(singleNum, powVal)));
			number = number/10;
		}
		//if satisfies Armstrong condition
		if(temp == sum) {
		System.out.println("Is Arm");
	} else 
		System.out.println("Not Arm");
		return 0;
	}
	
	//Method to calculate the length/power value of given number
	static int calculateLength(int number) {
		int powVal = 0;
		while(number != 0) {
			powVal++;
			number = number / 10;
		}
		//return power to isArmstrong method
		return powVal;
	}
	
		
	public static void main(String[] args){
		
		int number = 371;
		isArmstrong(number);
		number = 1253;
		isArmstrong(number);
	}
}
