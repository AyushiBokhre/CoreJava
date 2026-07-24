package com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayTask {
	public static void main(String[] args) {
		List list =new ArrayList();
		
		list.add("Rectangle");
		list.add("Triangle");
		list.add("Circle");
		list.add("Star");
		list.add("Diamond");
		list.add("Rectangle");
		list.add("Circle");
		
		System.out.println(list);
		
		   for (int i = 0; i < list.size(); i++) {
	            if (list.indexOf(list.get(i)) == i) {
	                System.out.print(list.get(i) + " ");
	            }
	        }
		
	
		
	}
}
