package com.collections;

import java.util.Date;

public class ProductInfo  {
	String name;
	Date mfd;
	int quantity;
	
	public ProductInfo(String name, Date mfd, int quantity){
		super();
		this.name = name;
		this.mfd = mfd;
		this.quantity = quantity;
	}
	
	/* Benefit of overriding toString: It will override java.lang.Object to toString method
	 * with java.lang.String method*/
	public String toString() {
		return (this.name+" "+this.mfd+" "+this.quantity);
	}
	
	

	/*@Override
	// Used for sorting in ascending order of product info
	public int compare(ProductInfo o1, ProductInfo o2) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
