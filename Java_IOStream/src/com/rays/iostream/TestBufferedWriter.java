package com.rays.iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
<<<<<<< HEAD
		BufferedWriter file = new BufferedWriter(
				new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\buffer.txt"));

=======
		BufferedWriter file=new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\buffer.txt"));
		
>>>>>>> 73caf71 (done)
=======
		BufferedWriter file = new BufferedWriter(
				new FileWriter("C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\buffer.txt"));

>>>>>>> 1e71671 (done)
		file.write("Hello Everyone!");
		file.newLine();
		file.write("I am Ayushi");
		System.out.println("write successfully");
		file.close();
<<<<<<< HEAD
<<<<<<< HEAD

=======
		
>>>>>>> 73caf71 (done)
=======

>>>>>>> 1e71671 (done)
	}

}
