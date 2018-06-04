package com.collections;

import java.util.Comparator;

public class SortbyProductInfo implements Comparator<ProductInfo>{
	
	@Override
	public int compare(ProductInfo a, ProductInfo b) {
		//return a.name.compareTo(b.name);
		return (b.quantity-a.quantity) ; //descending order
	}
}
