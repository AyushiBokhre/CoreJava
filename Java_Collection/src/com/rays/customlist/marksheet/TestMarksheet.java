package com.rays.customlist.marksheet;

public class TestMarksheet {
	public static void main(String[] args) {
		Marksheet m1=new Marksheet(101,"Raj",89,80,79);
		Marksheet m2=new Marksheet(102,"Aman",85,90,72);
		Marksheet m3=new Marksheet(103,"Ram",79,70,89);
		Marksheet m4=new Marksheet(104,"Ajay",89,80,79);
		Marksheet m5=new Marksheet(105,"Rajesh",89,80,79);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		System.out.println(m5.toString());	
		
	}

}
