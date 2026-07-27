package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Mango");
		list.add("Mango");
		list.add("Banana");
		list.add("Watermelon");
		
		System.out.println("List : "+list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
			if(o.equals("Mango")){
				it.remove();
				}
			}
		System.out.println("List : "+list);
	}

}
