package com.rays.oop.abstraction;

public class Triangle extends Shape{
	int height;
	int base;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	@Override
	public void area() {
		System.out.println("Area of Triangle : "+((height *base)/2));
		
	}
	
	

}
