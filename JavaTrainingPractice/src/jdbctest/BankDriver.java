package jdbctest;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) throws Exception {
		int sourceNo=0, destinationNo=0;
		BankTransaction bt = new BankTransactionImpl();
		bt.DBConnection();

		

		// take inputs for source & destination a/c number var's
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Source A/C number: ");
		sourceNo = input.nextInt(); //Source Account number

		System.out.println("Enter Destination A/C number: ");
		destinationNo = input.nextInt(); //Destination Account number
		
		
		
		boolean status = bt.transfer(sourceNo, destinationNo);



		// logic to acknowledge weather Transaction is success or not.
		

	}

}
