package com.rays.list;

import java.util.*;

public class TestListCollection {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(0,1);
		l.add(1,"Ayushi");
		l.add(2,true);
		l.add(3,2.3);
		l.add(4,'a');
		l.add(5,null);
		l.add(6,null);
		
		System.out.println("List : "+l);
		
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("value at 3 index : "+l.get(3));
		
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("remove value of 3 index : "+l.remove(3));
		System.out.println("List : "+l);
		
		System.out.println();
		System.out.println("--------------------------");
		
		l.set(1,"Tanisha");
		System.out.println("Replace Ayushi to Tanisha ");
		System.out.println("List : "+l);
		
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("Search index of 'a': "+l.indexOf('a'));
		
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("last index of true: "+l.lastIndexOf(true));
		
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("sublist : "+l.subList(1, 4));
		
	}

}
