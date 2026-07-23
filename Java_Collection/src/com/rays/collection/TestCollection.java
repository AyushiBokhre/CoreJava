package com.rays.collection;

//import java.util.ArrayList;
//import java.util.Collection;

import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection c= new ArrayList();
		
		c.add(45);
		c.add("Orange");
		c.add('a');
		c.add(4.9);
		c.add(true);
		
		System.out.println("Collection :"+c);
		System.out.println("Size of Collection : "+c.size());
		System.out.println("Mango is available. : "+c.contains("Mango"));
		System.out.println("Orange is available. : "+c.contains("Orange"));
		c.remove("Orange");
		
		System.out.println("---------------------");
		System.out.println("New Size of Collection : "+c.size());
		System.out.println("Collection is empty : "+c.isEmpty());
		System.out.println("---------------------");
		
		c.clear();
		System.out.println("New Size of Collection After clear() method : "+c.size());
		System.out.println("Collection is empty after clear method : "+c.isEmpty());
		System.out.println();
		
		
		
	}

}
