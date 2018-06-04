package com.exceptionhandlingconcepts;

import java.util.Scanner;

public class CheckEmployeeID {
	
	public boolean isValidId(String eid) throws InvalidEmployeeException {
		
		//using regular expression
		if(eid.matches("CS[0-9]{4}")) {
			System.out.println("Valid!");
			return false;
		}else {
			throw new InvalidEmployeeException("Invalid!");
	}		
	}

	public static void main(String[] args) throws InvalidEmployeeException {
		
		System.out.println("Enter Employee Id: ");
		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		
		CheckEmployeeID e = new CheckEmployeeID();
		
		try {
		e.isValidId(id);
		}catch(Exception exp){
			System.out.println(exp);
		}
		System.out.println("Main End..");
	}

}
