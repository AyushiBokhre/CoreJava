package com.rays.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\image.jpg";

		String target = "C:\\Users\\lenovo\\OneDrive\\Desktop\\IOFiles\\image-copy.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();
		
		while (i != -1) {
			System.out.println(i);
			out.write(i);
			i = in.read();
		}
		in.close();
		out.close();
		System.out.println("sucessfully......");
	}

}
