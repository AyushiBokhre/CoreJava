package com.rays.customlist.employee;

public class Employee {
	private int empId;
	private String name;
	private String company;
	private double salary;
	
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
	

}
