package com.rays.oop.abstraction;

public class Circle extends Shape{
	int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void area() {
		System.out.println("Area of Circle : "+(3.14*radius*radius));
		
		
	}

}
