package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestAllCollection {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add(45);
		c1.add("Orange");
		c1.add('a');
		c1.add(4.9);
		c1.add(true);

		System.out.println("Collection 1 :" + c1);
		System.out.println("Size of Collection : " + c1.size());
		
		System.out.println();
		System.out.println("--------------------------");
		
		Collection c2 = new ArrayList();

		c2.add(65);
		c2.add("Mango");
		c2.add('b');
		c2.add(1.1);
	
		System.out.println("Collection 2 :" + c2);
		System.out.println("Size of Collection : " + c2.size());

		System.out.println();
		System.out.println("--------------------------");
		
		c1.addAll(c2);
		System.out.println("Collection : "+c1);
		System.out.println("C1 contains C2 " +c1.containsAll(c2));
		System.out.println("Size of  New Collection : " + c1.size());
		
		System.out.println();
		System.out.println("--------------------------");
		
		c1.retainAll(c2);
		System.out.println("Collection After retainAll(): "+c1);
		
		System.out.println();
		System.out.println("--------------------------");
		
		c1.removeAll(c2);
		System.out.println("Collection : "+c1);
		System.out.println("C1 contains C2 " +c1.containsAll(c2));
		
		System.out.println();
		System.out.println("--------------------------");
		
		
		
	}

}
