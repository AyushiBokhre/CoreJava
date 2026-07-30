package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		 System.out.println("---------------Details of Businessman-----------");
		 
		 Businessman b=new Businessman();
		 
		 b.setName("Rajesh");
		 b.setAddress("Indore");
		 b.setDob(sdf.parse("1992/03/04"));
		 b.setIncome(50000.00);
		 
		 System.out.println("Name: "+b.getName());
		 System.out.println("Address: "+b.getAddress());
		 System.out.println("DOB: "+sdf.format(b.getDob()));
		 System.out.println("Income: "+b.getIncome());
		 
		 
		 System.out.println("-------------Detail of Doctor------------");

		 
		 Doctor d= new Doctor();
		 
		 d.setName("Ravi");
		 d.setAddress("Mhow");
		 d.setDob(sdf.parse("1993/09/07"));
		 d.setRegistrationNo("abc123");
		 
		 System.out.println("Name: "+d.getName());
		 System.out.println("Address: "+d.getAddress());
		 System.out.println("DOB: "+sdf.format(d.getDob()));
		 System.out.println("Registration No.: "+d.getRegistrationNo());
		 
		 System.out.println("-----------Detail of Student-----------");
		 
		 Student s=new Student();
		 
		 s.setName("Ram");
		 s.setAddress("Ujjain");
		 s.setDob(sdf.parse("2000/03/13"));
		 s.setRollNo("001");
		 s.setMarks(88);
		 
		 System.out.println("Name: "+s.getName());
		 System.out.println("Address: "+s.getAddress());
		 System.out.println("DOB: "+sdf.format(s.getDob()));
		 System.out.println("Roll No.: "+s.getRollNo());
		 System.out.println("Marks: "+s.getMarks());
		 
	}

}
