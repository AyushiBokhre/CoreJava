package com.rays.sort.comparable;

public class Student implements Comparable<Student> {
	public String name;
	public int rollNo;
	public String subject;
	
	public Student(int rollNo,String name, String subject) {
		this.name=name;
		this.rollNo=rollNo;
		this.subject=subject;
	}
	
	@Override
	public String toString() {
		return  "Roll No.: "+rollNo+", Name: "+name+ ", Subject: "+subject;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo-o.rollNo;//asc
		//return o.rollNo-this.rollNo;//desc
	}

}
