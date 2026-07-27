package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {	public static void main(String[] args) {
	Vector v = new Vector();
	
	v.add("Mango");
	v.add("Mango");
	v.add("Banana");
	v.add("Watermelon");
	
	System.out.println("List : "+v);
	
	Enumeration e = v.elements();
	
	while(e.hasMoreElements()) {
		Object o=e.nextElement();
		System.out.println(o);
		}
	System.out.println("List : "+v);
}

}
