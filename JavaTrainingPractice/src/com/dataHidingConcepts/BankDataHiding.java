package com.dataHidingConcepts;

public class BankDataHiding {

	private float balance = 3000.15f;
	
	 
	public void setBalance(float balance) {
		
		this.balance += balance;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public  float withdraw(float withdrawAmount) {
		this.balance = balance - withdrawAmount; 
		if(balance <= 0.0) {
			System.out.println("Insufficient balance!");
		}
		else {
			System.out.println("Amount after Withdraw: " +balance); 
		}
		return balance;
	}

}
