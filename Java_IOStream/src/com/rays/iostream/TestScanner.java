package com.rays.iostream;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name=sc.nextLine();
		System.out.println("hello "+name);
		
		System.out.println("How old are you?");
		int age=sc.nextInt();
		System.out.println("Ohh... you are "+age+" yrs old.");
	}

}
