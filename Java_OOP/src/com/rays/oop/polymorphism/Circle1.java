package com.rays.oop.polymorphism;

public class Circle1 extends Shape1{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void area() {
		double circleArea=3.14*radius*radius;
		System.out.println("area of Circle : "+circleArea);
	}
	
	@Override
	public boolean validate() {
		if(radius>0) {
			return true;
		}else {
			return false;
		}
	}

}
