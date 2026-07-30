package com.rays.oop.constructor;

public class TestPerson {
	public static void main(String[] args) {

		Person p = new Person("Aysuhi", "Indore", "04/09/2004");
		System.out.println("Name:" + p.getName());
		System.out.println("Address : " + p.getAddress());
		System.out.println("DOB : " + p.getDob());
		System.out.println();

		System.out.println("----------------");
		
		Person p1 = new Person("Tanisha", "Indore", "05/05/2004");
		System.out.println("Name:" + p1.getName());
		System.out.println("Address : " + p1.getAddress());
		System.out.println("DOB : " + p1.getDob());

	}

}
