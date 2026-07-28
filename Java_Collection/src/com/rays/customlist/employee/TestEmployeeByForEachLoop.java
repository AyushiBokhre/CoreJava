package com.rays.customlist.employee;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeByForEachLoop {
	public static void main(String[] args) {
		Employee e1 =new Employee(101,"Ram","TCS",50000.00);
		Employee e2 =new Employee(102,"Ajay","Infosys",55000.00);
		Employee e3 =new Employee(103,"Aman","Capegemini",60000.00);
		Employee e4 =new Employee(104,"Rajesh","Wipro",65000.00);
		Employee e5 =new Employee(105,"Raman","NCS",55000.00);
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		for(Employee e:list) {
			System.out.println(e);
		}
	
	}
}
