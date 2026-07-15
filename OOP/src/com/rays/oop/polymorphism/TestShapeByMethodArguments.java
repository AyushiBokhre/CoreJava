package com.rays.oop.polymorphism;

public class TestShapeByMethodArguments {

	static void calculateArea(Shape[] s) {
		for (Shape s1 : s) {
			s1.area();
		}

	}

	public static void main(String[] args) {
		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		Circle c = (Circle) s[0];
		c.setRadius(2);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(3);
		r.setWidth(3);
		
		Triangle t = (Triangle) s[2];
		t.setBase(3);
		t.setHeight(2);

		calculateArea(s);
	}
}
