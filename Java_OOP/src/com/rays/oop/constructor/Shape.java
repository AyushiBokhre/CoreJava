package com.rays.oop.constructor;

public class Shape {
	public String color;
	public int borderWidth;
	
	public Shape() {
		System.out.println("this is default constructor.");
	}
	public Shape(String color) {
		this();
		this.color=color;
		System.out.println("color : "+this.color);
	}
	public Shape(String color,int borderWidth) {
		this(color);
		this.borderWidth=borderWidth;
		System.out.println("borederWidth : "+this.borderWidth);
		
	}
	
	public static void main(String[] args) {
		Shape s=new Shape("red");
		
	}

}
