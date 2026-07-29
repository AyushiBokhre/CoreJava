package com.rays.sort.comparator;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//return o2.salary-o1.salary;//asc
		return o1.salary-o2.salary;//desc
	}
	

}
