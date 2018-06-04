package com.service;

import com.beans.Sender;
import com.beans.Receiver;
import java.util.Scanner;

public class BankDriver {
	 //BankDriver and Sender/Receiver has a "Has-A" relationship
	static Sender s1 = new Sender();
	static Receiver r1 = new Receiver();
	
	public void transaction(Sender sender, Receiver receiver) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much amount you want to transfer?");
		int amt = sc.nextInt();
		
		if(amt > sender.getBalance()){
			System.out.println("Insufficient Balance! Please try again with lesser amount.");
		}else {
		sender.deduct(amt);
		receiver.deposit(amt);
		
		System.out.println("Final balance in Sender A/c: " +sender.getBalance());
		System.out.println("Final balance in Receiver A/c: " +receiver.getBalance());
	}
	}
		
	

	public static void main(String[] args) {
		
		BankDriver b1 = new BankDriver();
		b1.transaction(s1, r1);
		
	}

}
