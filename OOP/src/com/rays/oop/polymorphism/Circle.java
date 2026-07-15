package com.rays.oop.polymorphism;

public class Circle extends Shape {
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle : " + (3.14 * radius * radius));
	}
}
