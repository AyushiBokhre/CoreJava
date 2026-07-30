package com.rays.oop.encapsulation;

public class Automobiles {
	
	private String color;
	private int speed;
//	private String make;
	private String company;
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
//	public void setMake(String make) {
//		this.make=make;
//	}
//	
//	public String getMake() {
//		return make;
//	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	
	public String getCompany() {
		return company;
	}
}
