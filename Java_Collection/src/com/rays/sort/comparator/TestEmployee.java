package com.rays.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 =new Employee(101,"Ram","TCS",50000);
		Employee e2 =new Employee(102,"Ajay","Infosys",55000);
		Employee e3 =new Employee(103,"Aman","Capegemini",60000);
		Employee e4 =new Employee(104,"Rajesh","Wipro",65000);
		Employee e5 =new Employee(105,"Raman","NCS",55000);
		
		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("----------------------");
		System.out.println("Original List: ");
		System.out.println("----------------------");
		list.forEach(System.out::println);
		System.out.println();
		
		OrderBySalary bySalary = new OrderBySalary();
		Collections.sort(list,bySalary);
		System.out.println("----------------------");
		System.out.println("Order By Salary: ");
		System.out.println("----------------------");
		list.forEach(System.out::println);
		System.out.println();
		
		OrderByCompany byCompany= new OrderByCompany();
		Collections.sort(list,byCompany);
		System.out.println("----------------------");
		System.out.println("Order By Company: ");
		System.out.println("----------------------");
		list.forEach(System.out::println);
		System.out.println();
	}

}
