package com.exceptionhandlingconcepts;

public class InvalidEmployeeException extends Exception { //User defined exception
	
	InvalidEmployeeException(String str){ //Constructor
		
		super(str); //invoke superclass constructor, methods and properties
		
	}
}
