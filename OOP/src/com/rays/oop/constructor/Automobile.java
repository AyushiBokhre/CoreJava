package com.rays.oop.constructor;

public class Automobile {
	private String color;
	private String make;
	private int speed;

	public Automobile(String color, String make, int speed) {
		this.color = color;
		this.make = make;
		this.speed = speed;

	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}
}
