package com.rays.customlist.employee;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeByForEachMethod {
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Ram", "TCS", 50000);
		Employee e2 = new Employee(102, "Ajay", "Infosys", 55000);
		Employee e3 = new Employee(103, "Aman", "Capegemini", 60000);
		Employee e4 = new Employee(104, "Rajesh", "Wipro", 65000);
		Employee e5 = new Employee(105, "Raman", "NCS", 55000);
		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		list.forEach(System.out::println);
	}

}
