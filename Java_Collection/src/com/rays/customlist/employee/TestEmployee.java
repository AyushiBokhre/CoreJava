package com.rays.customlist.employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 =new Employee(101,"Ram","TCS",50000.00);
		Employee e2 =new Employee(102,"Ajay","Infosys",55000.00);
		Employee e3 =new Employee(103,"Aman","Capegemini",60000.00);
		Employee e4 =new Employee(104,"Rajesh","Wipro",65000.00);
		Employee e5 =new Employee(105,"Raman","NCS",55000.00);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());	
	}

}
