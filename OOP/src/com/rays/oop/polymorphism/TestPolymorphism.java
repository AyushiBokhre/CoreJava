package com.rays.oop.polymorphism;

public class TestPolymorphism {
	public static void main(String[] args) {
		Shape1 s=new Rectangle1();
		Rectangle1 r=(Rectangle1)s;
		r.setLength(2);
		r.setWidth(13);
		
		Shape1 s1=new Circle1();
		Circle1 c=(Circle1)s1;
		c.setRadius(3);
		
		Shape1 s2=new Triangle1();
		Triangle1 t=(Triangle1)s2;
		t.setBase(3);
		t.setHeight(4);
		
		
		s.execute();
		s1.execute();
		s2.execute();
		
	}

}
