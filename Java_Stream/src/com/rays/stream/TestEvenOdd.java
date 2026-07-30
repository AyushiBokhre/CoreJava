package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestEvenOdd {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}

		System.out.println("----------------------");
		System.out.println("List of Numbers:");
		System.out.println("----------------------");
		list.stream().forEach(System.out::println);
		System.out.println();

		System.out.println("----------------------");
		System.out.println("List of Even Numbers:");
		System.out.println("----------------------");
		list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
		System.out.println();

		System.out.println("----------------------");
		System.out.println("List of Odd Numbers:");
		System.out.println("----------------------");
		list.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
		System.out.println();

	}

}
