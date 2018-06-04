package com.beans;

public class Sender {
	private int balance = 5000;
	public int getBalance() {
		return balance;
	}
	
	public void deduct(int balance) {
		this.balance = this.balance - balance;
		
		}
	

}
