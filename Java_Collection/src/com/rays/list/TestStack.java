package com.rays.list;

import java.util.Stack;

public class TestStack {

		public static void main(String[] args) {

			Stack s = new Stack();

			for (char c = 'a'; c <= 'z'; c++) {
				s.push(c);
			}
			
			System.out.println("original stack: " + s);
			System.out.println();
			System.out.println("Peek element : "+s.peek());
			System.out.println();
			System.out.println("stack after peek(): " + s);
			System.out.println();
			System.out.println("pop element : "+s.pop());
			System.out.println();
			System.out.println("stack after pop(): " + s);

		}

	}


