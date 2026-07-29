package com.rays.sort.comparator;

public class Employee {
	public int empId;
	public String name;
	public String company;
	public int salary;
	
	public Employee(int empId,String name,String company,int salary) {
		this.empId=empId;
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "ID: " + empId +", Name: "+name+", Company: "+company+", Salary: "+salary;
	}
	

}
