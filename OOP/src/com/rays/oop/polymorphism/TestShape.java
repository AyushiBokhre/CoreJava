package com.rays.oop.polymorphism;
//Creating object of parent(Shape) class and reference of Child (Circle,rectangle,Triangle), 
//we need to do type casting 
//By using this method, we create  multiple object of shape class  
//to reduce this we use array to store all the object ofParent class 				 
public class TestShape {
	public static void main(String[] args) {
		
		Shape s1=new Circle();
		Circle c=(Circle)s1;
		c.setRadius(2);
		c.area();
		
		Shape s2= new Rectangle();
		Rectangle r=(Rectangle)s2;
		r.setLength(2);
		r.setWidth(4);
		r.area();
		
		Shape s3=new Triangle();
		Triangle t=(Triangle)s3;
		t.setBase(2);
		t.setHeight(5);
		t.area();
		
	}

}
