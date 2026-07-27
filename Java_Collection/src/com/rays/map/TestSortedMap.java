package com.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
	public static void main(String[] args) {

		SortedMap m = new TreeMap();
		m.put(1, "Apple");
		m.put(2, "Mango");
		m.put(3,"Banana");

		
		System.out.println(m);
		System.out.println(m.get(3));
		System.out.println(m.remove(2));
		System.out.println(m);
		m.clear();
		System.out.println(m);
		
	}
	

}
