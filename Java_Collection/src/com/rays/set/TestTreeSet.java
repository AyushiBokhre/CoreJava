package com.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('c');
		s.add('b');
		s.add('a');

		System.out.println(s);

	}

}
