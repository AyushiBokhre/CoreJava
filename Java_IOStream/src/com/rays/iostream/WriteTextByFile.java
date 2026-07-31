package com.rays.iostream;

import java.io.FileWriter;

public class WriteTextByFile {
	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\hello.txt");

		file.write("hello everyone!");
		file.write("\n");
		file.write("I am Ayushi");
		
		System.out.println("write in file successfully.");
		file.close();
	}

}
