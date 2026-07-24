package com.rays.list;

import java.util.Stack;

public class StackTask {
	public static void main(String[] args) {
		//create two stack s1 and s2 
		Stack s1= new Stack();
		Stack s2 =new Stack();
		
		// Push a to z into Stack s1
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            s1.push(ch);
        }
    
        System.out.println("Stack S1: " + s1);
        System.out.println();
        System.out.println("Stack S2: " + s2);
        System.out.println();
    
        // Transfer elements from S1 to S2 using for loop
        for (char ch = 'a'; ch <= 'z'; ch++) {
            s2.push(s1.pop());
        }

        System.out.println("Stack S1 after transfer: " + s1);
        System.out.println();
        System.out.println("Stack S2 after transfer: " + s2);
	}

}
