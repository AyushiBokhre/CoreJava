package com.rays.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Ram","Maths");
		Student s2 = new Student( 103, "Shayam","Maths");
		Student s3 = new Student( 104, "Aman","Maths");
		Student s4 = new Student( 102,"Kamlesh", "Maths");

		List<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("----------------------------");
	    System.out.println("Original list:");
	    System.out.println("----------------------------");
		list.forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------------------");
	    System.out.println("Order By Roll No.:");
	    System.out.println("----------------------------");
	    Collections.sort(list);
	    list.forEach(System.out::println);
		System.out.println();
		

	}

}
