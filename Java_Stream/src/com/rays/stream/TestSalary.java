package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSalary {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(50000);
		list.add(52000);
		list.add(45000);
		list.add(48000);
		list.add(55000);
		list.add(40000);
		
		System.out.println("----------------------");
		System.out.println("List of Salary:");
		System.out.println("----------------------");
		list.stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("Highest Salary:");
		System.out.println("----------------------");
		list.stream().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("Second Highest Salary:");
		System.out.println("----------------------");
		list.stream().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		System.out.println();
		
		
	}

}
