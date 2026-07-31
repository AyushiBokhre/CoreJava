package com.rays.iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
	public static void main(String[] args) throws IOException {
		BufferedWriter file=new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\buffer.txt"));
		
		file.write("Hello Everyone!");
		file.newLine();
		file.write("I am Ayushi");
		System.out.println("write successfully");
		file.close();
		
	}

}
