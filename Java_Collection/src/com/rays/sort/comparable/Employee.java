package com.rays.sort.comparable;

public class Employee implements Comparable<Employee>{
	public int empId;
	public String name;
	public String company;
	public double salary;
	
	public Employee(int empId,String name,String company,double salary) {
		this.empId=empId;
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "ID: " + empId +", Name: "+name+", Company: "+company+", Salary: "+salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		//return this.empId-o.empId;//asc
		return o.empId-this.empId;//desc
	}

}
