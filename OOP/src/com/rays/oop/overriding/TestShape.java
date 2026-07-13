package com.rays.oop.overriding;

public class TestShape {
	public static void main(String[] args) {

		System.out.println("---------Circle-----------");
		
		Circle c = new Circle();
		c.setColor("Red");
		c.setBorderWidth(2);
		c.setRadius(4);
		System.out.println("Color:" + c.getColor());
		System.out.println("Border Width: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();
		System.out.println();
		
		System.out.println("---------Rectangle-----------");

		Rectangle r = new Rectangle();
		r.setColor("Blue");
		r.setBorderWidth(2);
		r.setLength(2);
		r.setWidth(1);
		System.out.println("Color:" + r.getColor());
		System.out.println("Border Width: " + r.getBorderWidth());
		System.out.println("Length:" + r.getLength());
		System.out.println("Width: " + r.getWidth());
		r.area();
		System.out.println();

		System.out.println("---------Triangle-----------");

		Triangle t = new Triangle();
		t.setColor("yellow");
		t.setBorderWidth(1);
		t.setHeight(3);
		t.setBase(2);
		System.out.println("Color:" + t.getColor());
		System.out.println("Border Width: " + t.getBorderWidth());
		System.out.println("Height:" + t.getHeight());
		System.out.println("Base: " + t.getBase());
		t.area();

	}

}
