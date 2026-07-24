package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTask {
	public static void main(String[] args) {
		Queue q1=new ArrayDeque();
		Queue q2=new ArrayDeque();
		
		//insert values in queue
		for(char ch ='a';ch<='z';ch++) {
			q1.add(ch);
		}
		 System.out.println("Queue q1: " + q1);
	        System.out.println();
	        System.out.println("Queue q2: " + q2);
	        System.out.println();
		
		//remove from q1 and transfer it to q2
		
		for(char ch ='a';ch<='z';ch++) {
			q2.add(q1.poll());
		}
		System.out.println("Queue q1 after removing element: " + q1);
        System.out.println();
        System.out.println("Queue q2 after insertion of q1 element: " + q2);
	}
	
		
		
	
	
	

}
