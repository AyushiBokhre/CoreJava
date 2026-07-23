package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionUsingFor {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(45);
		c.add("Orange");
		c.add('a');
		c.add(4.9);
		c.add(true);

		System.out.println("Collection :" + c);
		System.out.println("Size of Collection : " + c.size());
		
		System.out.println("----------------------");
		
		System.out.println("Using for each loop");
		for(Object o:c) {
			System.out.println(o);
		}
	}

}
