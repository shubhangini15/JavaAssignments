
public class BinaryToDecimal {

	public static void main(String[] args) {
		String bin = "10";
		convertBinaryToDec(bin);
	}
	
	static int convertBinaryToDec (String bin) {
		//Parse string into int using method 
		int result = Integer.parseInt(bin);
		
		// variable for 2^power
		int power = 0; 
		
		//variable holds the decimal number
		int decimal = 0;
		
		//if input is 0
		if(result == 0) {
			return 0;
		} else {
		// loop iteration, once condition for while loop is 
		//no longer true so loop terminates and return true	
		while(result != 0) {
		int lastNum = result % 10;
		decimal += (int) Math.pow(2, power) * lastNum;
		result = result/10;
		power++;
	}
		System.out.println(decimal);
		return decimal;

}
}
}





/*int number = Integer.parseInt(binary,2);
System.out.print(number);*/

//Convert String to int array
/*int[] intArray = new int[binary.length()];

for(int i = 0; i < intArray.length; i++) {
	intArray[i] = Integer.parseInt(binary);
	System.out.println(intArray[i]);
}*/