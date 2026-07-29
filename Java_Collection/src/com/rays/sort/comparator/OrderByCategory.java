package com.rays.sort.comparator;

import java.util.Comparator;

public class OrderByCategory implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.category.compareTo(o2.category);
	}

}
