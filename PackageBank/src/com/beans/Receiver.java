package com.beans;

public class Receiver {
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int balance) {
		
		this.balance = this.balance + balance;
	
	}
	
}
