package com.rays.oop.polymorphism;

public class TestShapeByArray {
	public static void main(String[] args) {
		Shape[] s= new Shape[3];
		
		s[0]=new Circle();
		s[1]=new Rectangle();
		s[2]=new Triangle();
		
		Circle c=(Circle)s[0];
		c.setRadius(2);
		
		Rectangle r=(Rectangle)s[1];
		r.setLength(2);
		r.setWidth(4);
		
		Triangle t=(Triangle)s[2];
		t.setBase(2);
		t.setHeight(5);
		
		for(int i=0;i<s.length;i++) {
			s[i].area();
		}
		
		
		
				
				
	}

}
