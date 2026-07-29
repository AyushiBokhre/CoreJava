package com.rays.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestProduct {
	public static void main(String[] args) {
		 Product p1 = new Product(5, "Laptop", 40000, "Electronics");
	     Product p2 = new Product(2, "Mobile", 20000, "Electronics");
	     Product p3 = new Product(1, "Shoes", 3000, "Fashion");
	     Product p4 = new Product(4, "Watch", 5000, "Accessories");
	     Product p5 = new Product(3, "Headphones", 2500, "Electronics");
	     
	     ArrayList<Product> list = new ArrayList<>();
	     
	     list.add(p1);
	     list.add(p2);
	     list.add(p3);
	     list.add(p4);
	     list.add(p5);
	     System.out.println("----------------------------");
	     System.out.println("Original list: ");
	     System.out.println("----------------------------");
	     list.forEach(System.out::println);
	     System.out.println();
	     
	     OrderByName byName=new OrderByName();
	     System.out.println("----------------------------");
	     System.out.println("Order by Name: ");
	     Collections.sort(list, byName);
	     System.out.println("----------------------------");
	     list.forEach(System.out::println);
	     System.out.println();
	     
	     OrderByPrice byPrice=new OrderByPrice();
	     System.out.println("----------------------------");
	     System.out.println("Order by Price: ");
	     Collections.sort(list, byPrice);
	     System.out.println("----------------------------");
	     list.forEach(System.out::println);
	     System.out.println();
	     
	     OrderByCategory byCategory=new OrderByCategory();
	     System.out.println("----------------------------");
	     System.out.println("Order by Category: ");
	     Collections.sort(list, byCategory);
	     System.out.println("----------------------------");
	     list.forEach(System.out::println);
	     System.out.println();

	     

	}


}
