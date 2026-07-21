package com.rays.oop.polymorphism;

public class Triangle1 extends Shape1 {
	private int height;
	private int base;

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
		int triangleArea = ((height * base) / 2);
		System.out.println("Area of Triangle : " + triangleArea);
	}

	@Override
	public boolean validate() {
		if (height > 0 && base > 0) {
			return true;
		} else {
			return false;
		}
	}

}
