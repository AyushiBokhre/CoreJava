package com.rays.sort.comparator;

import java.util.Comparator;

public class OrderByPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		//return o1.price-o2.price;//asc
		return o2.price-o1.price;//desc
		
	}
	

}
