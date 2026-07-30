package com.rays.oop.polymorphism;

public class Rectangle1 extends Shape1 {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void area() {
		int rectangleArea = length * width;
		System.out.println("Area of Rectangple = " + rectangleArea);
	}

	@Override
	public boolean validate() {
		if (length > 0 && width > 0) {
			return true;
		}else {
			return false;
		}
	}

}
