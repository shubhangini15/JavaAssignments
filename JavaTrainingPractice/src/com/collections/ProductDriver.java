package com.collections;

import java.util.Calendar;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

public class ProductDriver {
	
	public static void main (String[] args) {
		
		Map<ProductID, ProductInfo> product = new TreeMap<>(new SortbyProductID());
		
//		Set< ProductInfo> product = new TreeSet< ProductInfo>(new SortbyProductInfo());
		ProductID id1 = new ProductID(1001);
		ProductInfo pInfo1 = new ProductInfo("Classmate", Calendar.getInstance().getTime(), 2);
		ProductID id2 = new ProductID(1002);
		ProductInfo pInfo2 = new ProductInfo("HP", Calendar.getInstance().getTime(), 5);
		
//		product.add(pInfo1);
//		product.add(pInfo2);
		
		product.put(id1, pInfo1);
		product.put(id2, pInfo2);
		
		System.out.println(product);
		
//		System.out.println(product.get(1001));
		
		Set keys = product.keySet();
		System.out.println("Keys: "+keys);
		
		System.out.println("Unsorted");
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Integer i = (Integer) itr.next();
			System.out.println(i+ "-->" +product/*.get(i)*/);
		}
		
	//Collections.sort(product, new SortbyProductID());
		
		/*System.out.println("Sort by Name");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()) {
			//System.out.println(itr.next());
			Integer i = (Integer) itr1.next();
			System.out.println(i+ "-->" +product.get(i));
		}*/
				
	}

}
