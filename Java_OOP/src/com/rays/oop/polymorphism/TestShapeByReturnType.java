package com.rays.oop.polymorphism;

public class TestShapeByReturnType {
	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(3);

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

	static void calculateArea(Shape[] s) {
		for (Shape s1 : s) {
			s1.area();
		}

	}
}
