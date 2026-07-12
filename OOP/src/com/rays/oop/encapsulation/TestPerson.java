package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Person p = new Person();

		p.setName("Ayushi");
		p.setAddress("Indore");
		p.setDob(sdf.parse("2004/09/04"));

		System.out.println("Name :" + p.getName());
		System.out.println("Address :" + p.getAddress());
		System.out.println("DOB :" + sdf.format(p.getDob()));
		System.out.println("Age : "+p.getAge(p.getDob()));

		System.out.println("-----------------");

		Person p1 = new Person();

		p1.setName("Tanisha");
		p1.setAddress("Indore");
		p1.setDob(sdf.parse("2004/05/05"));

		System.out.println("Name :" + p1.getName());
		System.out.println("Address :" + p1.getAddress());
		System.out.println("DOB :" + sdf.format(p1.getDob()));
		System.out.println("Age : "+p1.getAge(p1.getDob()));

		
		System.out.println("-----------------");

		Person p2 = new Person();

		p2.setName("Meet");
		p2.setAddress("Indore");
		p2.setDob(sdf.parse("2005/12/21"));

		System.out.println("Name :" + p2.getName());
		System.out.println("Address :" + p2.getAddress());
		System.out.println("DOB :" + sdf.format(p2.getDob()));
		System.out.println("Age : "+p2.getAge(p2.getDob()));

	}

}
