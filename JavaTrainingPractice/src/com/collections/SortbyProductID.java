package com.collections;

import java.util.Comparator;

public class SortbyProductID implements Comparator<ProductID>{
	
	@Override
	public int compare(ProductID a, ProductID b) {
		return a.pId - b.pId;
	}
} 
