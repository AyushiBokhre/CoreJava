package com.rays.customlist.marksheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestByIterator {
	public static void main(String[] args) {
		Marksheet m1=new Marksheet(101,"Raj",89,80,79);
		Marksheet m2=new Marksheet(105,"Aman",85,90,72);
		Marksheet m3=new Marksheet(102,"Ram",79,70,89);
		Marksheet m4=new Marksheet(103,"Ajay",89,80,79);
		Marksheet m5=new Marksheet(104,"Rajesh",89,80,79);
		
		List<Marksheet> list =new ArrayList<Marksheet>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		Iterator<Marksheet> it = list.iterator();
		
		while(it.hasNext()) {
			Marksheet m=it.next();
			System.out.println(m);
			
		}
		}

}
