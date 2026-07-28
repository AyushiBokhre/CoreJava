package com.rays.customlist.marksheet;

public class Marksheet {
	private int rollNo;
	private String name;
	private int phy;
	private int chem;
	private int math;
	
	
	public Marksheet(int rollNo,String name,int phy,int chem,int math) {
		this.rollNo=rollNo;
		this.name=name;
		this.phy=phy;
		this.chem=chem;
		this.math=math;
		
	}
	 
	@Override
	public String toString() {
		return "Roll No.: "+rollNo+ ", Name: "+name+", Physics: "+phy+", Chemistry :"+ chem+", Maths: "+math; 
	}
	
	
	

}
