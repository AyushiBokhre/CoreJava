package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Ayushi");
		list.add("Tanisha");
		list.add("Mahak");
		list.add("Kashish");
		list.add("Nandini");
		list.add("Sneha");
		list.add("Mahak");
		list.add("Kashish");
		
		System.out.println("----------------------");
		System.out.println("List:");
		System.out.println("----------------------");
		list.forEach(System.out::println);
		System.out.println();
		

		System.out.println("----------------------");
		System.out.println("List in Ascending order:");
		System.out.println("----------------------");
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		

		System.out.println("----------------------");
		System.out.println("List in Descending order:");
		System.out.println("----------------------");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("List elements in UpperCase :");
		System.out.println("----------------------");
		list.stream().sorted().map(e->e.toUpperCase()).forEach(System.out::println);
		System.out.println();
		

		System.out.println("----------------------");
		System.out.println("List elements in LowerCase :");
		System.out.println("----------------------");
		list.stream().sorted().map(e->e.toLowerCase()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("Unique values list :");
		System.out.println("----------------------");
		list.stream().sorted().distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------------");
		System.out.println("Elements starts with 'a' :");
		System.out.println("----------------------------");
		list.stream().sorted().distinct().filter(e->e.startsWith("K")).forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("Elements ends with 'k' :");
		System.out.println("----------------------");
		list.stream().sorted().distinct().filter(e->e.endsWith("a")).forEach(System.out::println);
		System.out.println();
		
		
		
		
		
	}

}
