package com.rays.queue;

import java.util.*;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new ArrayDeque();
		q.add(1);
		q.add("Ayushi");
		q.add('a');
		q.add(true);
		q.offer(4);

		System.out.println("Queue : " + q);

		System.out.println("--------------");
		System.out.println("Remove Ayushi : " + q.remove("Ayushi"));
		System.out.println(q);
		System.out.println("--------------");
		System.out.println("poll() remove the first element :" + q.poll());
		System.out.println(q);
		System.out.println("--------------");
		System.out.println("element() print first element : " + q.element());
		System.out.println(q);
		System.out.println("--------------");
		System.out.println("peek() print first element : " + q.peek());
		System.out.println(q);

	}

}
