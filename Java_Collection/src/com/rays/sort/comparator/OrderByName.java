package com.rays.sort.comparator;

import java.util.Comparator;

public class OrderByName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);//desc
		//return o2.name.compareTo(o1.name);//asc
	}

}
