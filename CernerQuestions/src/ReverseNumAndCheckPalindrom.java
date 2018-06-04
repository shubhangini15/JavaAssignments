
/* Given an initial number, reverse it and add it back to the initial.
 * Check if new number is a palindrome. If not repeat till is. 
 * If yes display how many iterations it took and the number.
 */
/* LOGIC: 123021 --> 120321 --> if No, repeat till int[2] position.--> if yes, display count++ & number again. 
 * */

public class ReverseNumAndCheckPalindrom {
	
	public static void main(String[] args) {

		int num = 12945;
		ReverseNumAndCheckPalindrom numObject = new ReverseNumAndCheckPalindrom();
		numObject.addOriginalAndReverse(num);
	}
	
	//Reverse and Add function
		int addOriginalAndReverse(int num) {
			int newNum = 0;
			
			//call reverseTheNumber function
			newNum = reverseTheNumber(num);
			
			//adding reversed number with original number
			num = num + newNum;
			//System.out.println("Sum of original & reverse number: " + num);
			
			//checking whether the number is palindrome or not 
			if(palindromOrNot(num)) {
				System.out.println("Is Palindrome "+ num);
			} else {
				System.out.println("Not palindrome");
			}
			return num;
		}
			
	
	/************ Reverse the Number **************/
	
	//Iterative function to reverse digits of number
	int reverseTheNumber(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + (num % 10);
			num = num / 10;
		}
		//System.out.println(reverseNum);
		return reverseNum;
	}
	
	
	/****************** Check number is palindrome or not *****************/
	//function to check new number is palindrome or not	
 boolean palindromOrNot(int num) {
	 return (reverseTheNumber(num) == num);
	}
}






















/*static int reverseNum = 0;
static int num = 0;
static int newNum = 0;
static int result = 0;*/


/*
 * public int checkPalindrome(int newNum,int result) { reverseNumber(newNum);
 * while(newNum != 0) { result = result * 10; result = result + (newNum%10);
 * newNum = newNum/10; } System.out.println("Reverse1: "+newNum);
 * System.out.println("Reverse2: "+result); if(newNum == result) {
 * System.out.println("Number is palindrome"); }else
 * System.out.println("NOT a palindrome number"); return result; }
 */
