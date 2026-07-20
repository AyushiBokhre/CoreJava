package com.rays.oop.abstraction;

public class TestShape {
public static void main(String[] args) {
	Circle c= new Circle();
	System.out.println("----------Circle--------------");
	c.setColor("red");
	c.setBorderwidth(1);
	c.setRadius(4);
	
	System.out.println("color : "+c.getColor());
	System.out.println("BorderWidth ; "+c.getBorderwidth());
	System.out.println("Radius : "+c.getRadius());
	c.area();
	System.out.println();
	
	Rectangle r= new Rectangle();
	System.out.println("----------Rectangle--------------");
	r.setColor("Blue");
	r.setBorderwidth(1);
	r.setLength(4);
	r.setWidth(6);
	
	System.out.println("color : "+r.getColor());
	System.out.println("BorderWidth : "+r.getBorderwidth());
	System.out.println("Length : "+r.getLength());
	System.out.println("Width : "+r.getWidth());
	r.area();
	System.out.println();
	
	Triangle t= new Triangle();
	System.out.println("----------Triangle--------------");
	t.setColor("Black");
	t.setBorderwidth(1);
	t.setHeight(4);
	t.setBase(2);
	
	System.out.println("color : "+t.getColor());
	System.out.println("BorderWidth : "+t.getBorderwidth());
	System.out.println("Height : "+t.getHeight());
	System.out.println("Base : "+t.getBase());
	t.area();
	System.out.println();
	
	
	
}
}
