package com.thisKeywordConcept;

public class Test {
	
	//don't know what type of object will be passed dynamically so use "this"
	 void rateOfInterest(this){ 
	    System.out.println("This will calculate Rate of Interest");
	}
	
	  public static void main (String[] args) {
	   // Test t1 = new Test();
		rateOfInterest(new Test());
	  }
}
