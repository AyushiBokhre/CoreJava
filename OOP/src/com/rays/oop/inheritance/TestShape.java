package com.rays.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("-----------Circle---------");

		Circle c = new Circle();
		c.setBorderWidth(1);
		c.setColor("red");
		c.setRadius(3);
		c.area();
		System.out.println("Color : " + c.getColor());
		System.out.println("Border Width : " + c.getBorderWidth());
		System.out.println("Radius : " + c.getRadius());

		System.out.println("-----------Rectangle---------");

		Rectangle r = new Rectangle();
		r.setBorderWidth(1);
		r.setColor("Blue");
		r.setBreadth(4);
		r.setLength(2);

		System.out.println("Color : " + r.getColor());
		System.out.println("Border Width : " + r.getBorderWidth());
		System.out.println("length : " + r.getLength());
		System.out.println("width : " + r.getWidth());
		r.area();

		System.out.println("-----------Triangle---------");

		Triangle t = new Triangle();

		t.setColor("yellow");
		t.setBorderWidth(1);
		t.setBase(2);
		t.setHeight(3);
		System.out.println("Color : " + t.getColor());
		System.out.println("Border Width : " + t.getBorderWidth());
		System.out.println("height : " + t.getHeight());
		System.out.println("base : " + t.getBase());
		t.area();

	}

}
