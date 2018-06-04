package com.collections;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class GoodsAndServices {
	
	Collection<Product> coll = new ArrayList<Product>();
	
	public void addProduct(Product p) {
		
		coll.add(p);
		System.out.println("Product object added successfully!");
	}
	
	public void viewProduct() {
		
		Iterator itr = coll.iterator();
		while(itr.hasNext()) {
			Product product = (Product) itr.next();
			System.out.println(product.id+ " "
			+product.name+" "+product.price+" "+product.mfd);
		}
	}
	
	public static void main(String[] args) {
		
		//Creating date
		@SuppressWarnings("deprecation")
		Date d1 = new Date(118,01,01); //year (year+1900),month,date
		Date d2 = new Date(); //current date
		@SuppressWarnings("deprecation")
		Date d3 = new Date(118,02, 29);
		
		Product p1 = new Product(101,"Maggi",49.99,d1);
		Product p2 = new Product(102,"Milk", 24.99, d2);
		Product p3 = new Product(103, "Butter", 45, d3);
		
		GoodsAndServices gs = new GoodsAndServices();
		gs.addProduct(p1);
		gs.addProduct(p2);
		gs.addProduct(p3);
		gs.viewProduct();
		
	}

}
