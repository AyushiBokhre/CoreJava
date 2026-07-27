package com.rays.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
	public static void main(String[] args) {
		
	List c= new ArrayList();
	
	c.add('b');
	c.add('d');
	c.add('a');
	c.add('e');
	c.add('c');
	
	System.out.println("Collection :"+c);
	Collections.sort(c);
	System.out.println("After sorting :"+c);
	
	Collections.shuffle(c);
	System.out.println("After shuffle :"+c);
	
	
	}
}
