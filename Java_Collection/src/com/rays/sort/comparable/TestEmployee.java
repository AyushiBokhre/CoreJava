package com.rays.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 =new Employee(105,"Ram","TCS",50000.00);
		Employee e2 =new Employee(101,"Ajay","Infosys",55000.00);
		Employee e3 =new Employee(104,"Aman","Capegemini",60000.00);
		Employee e4 =new Employee(103,"Rajesh","Wipro",65000.00);
		Employee e5 =new Employee(102,"Raman","NCS",55000.00);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
	     
	     list.add(e1);
	     list.add(e2);
	     list.add(e3);
	     list.add(e4);
	     list.add(e5);
	     
	     System.out.println("----------------------------");
	     System.out.println("Original list: ");
	     System.out.println("----------------------------");
	     list.forEach(System.out::println);
	     System.out.println();
	     
	     
	     Collections.sort(list);
	     System.out.println("----------------------------");
	     System.out.println("Order By ID: ");
	     System.out.println("----------------------------");
	     list.forEach(System.out::println);
	     System.out.println();
	     

	}

}
