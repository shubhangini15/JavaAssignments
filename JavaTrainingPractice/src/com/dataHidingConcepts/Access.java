package com.dataHidingConcepts;

import java.util.Scanner;

public class Access {

	public static void main(String[] args) {
		BankDataHiding bdh = new BankDataHiding();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Initial Balance: "+ bdh.getBalance());
		System.out.println("Enter amount to deposit: ");
		
		float amount = input.nextFloat();
		bdh.setBalance(amount);
		
		System.out.println("Amount after Deposit: " + bdh.getBalance());
		
		System.out.println("Enter amount to withdraw: ");
		
		float withdrawAmount = input.nextFloat();
		bdh.withdraw(withdrawAmount);

	}

}
