package com.collections;

import java.util.Date;

public class Product {
	//Data members
	int id;
	String name;
	double price;
	Date mfd;
	
	//Initialize parameterized constructor
	Product(int id, String name, double price, Date mfd){
		super();
		//assign local variable to instance variable
		this.id = id;
		this.name = name;
		this.price = price;
		this.mfd = mfd;
	}
	
	/*public String toString() {
		return "Product ID: "+id+", Name: "+name+", Price: "+price+", Manufacturing Date: "+mfd;
	}*/
	
	

}
